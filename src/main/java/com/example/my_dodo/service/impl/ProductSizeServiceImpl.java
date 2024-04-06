package com.example.my_dodo.service.impl;


import com.example.my_dodo.base.BaseServiceImpl;
import com.example.my_dodo.mapper.ProductSizeMapper;
import com.example.my_dodo.microservices.FileService;
import com.example.my_dodo.model.dto.ProductDTO;
import com.example.my_dodo.model.dto.ProductSizeDTO;
import com.example.my_dodo.model.entity.ProductSize;
import com.example.my_dodo.model.requests.ProductCreateRequest;
import com.example.my_dodo.model.response.ProductListResponse;
import com.example.my_dodo.model.response.ProductSizeListResponse;
import com.example.my_dodo.repository.ProductSizeRep;
import com.example.my_dodo.service.CategoryService;
import com.example.my_dodo.service.ProductService;
import com.example.my_dodo.service.ProductSizeService;
import com.example.my_dodo.service.SizeService;
import com.example.my_dodo.util.Language;
import com.example.my_dodo.util.ResourceBundleLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductSizeServiceImpl extends BaseServiceImpl<ProductSize, ProductSizeRep, ProductSizeDTO, ProductSizeMapper> implements ProductSizeService {

    private final FileService fileService;
    private final CategoryService categoryService;
    private final SizeService sizeService;
    private final ProductService productService;


    public ProductSizeServiceImpl(ProductSizeRep rep, ProductSizeMapper mapper, FileService fileService, CategoryService categoryService, SizeService sizeService, ProductService productService) {
        super(rep, mapper);
        this.fileService = fileService;
        this.categoryService = categoryService;
        this.sizeService = sizeService;
        this.productService = productService;
    }

    @Override
    public List<ProductSizeListResponse> getProductSizeList() {
        return rep.findProductSizeList();
    }

    @Override
    public List<ProductListResponse> getProductList() {
        return rep.findProductList();
    }

    @Override
    public String create(ProductCreateRequest request, Long productId, int lang) {

        ProductDTO product;

        if (productId == -1) {

            product = new ProductDTO();
            product.setName(request.getName());
            product.setDescription(request.getDescription());
            product.setLogo(fileService.upload(request.getLogo()).getDownloadUri());
            product.setCategory(categoryService.findById(request.getCategoryId()));
            product = productService.save(product);
        } else {
            product = productService.findById(productId);
        }

        ProductSizeDTO productSize = new ProductSizeDTO();

        productSize.setProduct(product);
        productSize.setSize(sizeService.findById(request.getSizeId()));
        productSize.setPrice(request.getPrice());

        save(productSize);

        return ResourceBundleLanguage.periodMessage(Language.getLanguage(lang), "entityCreated");

    }
}
