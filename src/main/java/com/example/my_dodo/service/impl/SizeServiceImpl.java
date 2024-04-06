package com.example.my_dodo.service.impl;


import com.example.my_dodo.base.BaseServiceImpl;
import com.example.my_dodo.mapper.SizeMapper;
import com.example.my_dodo.model.dto.SizeDTO;
import com.example.my_dodo.model.entity.Size;
import com.example.my_dodo.model.response.SizeListResponse;
import com.example.my_dodo.repository.SizeRep;
import com.example.my_dodo.service.SizeService;
import com.example.my_dodo.util.Language;
import com.example.my_dodo.util.ResourceBundleLanguage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SizeServiceImpl extends BaseServiceImpl<Size, SizeRep, SizeDTO, SizeMapper> implements SizeService {
    public SizeServiceImpl(SizeRep rep, SizeMapper mapper) {
        super(rep, mapper);
    }

    @Override
    public String create(String name, int lang) {

        SizeDTO dto = new SizeDTO();
        dto.setName(name);
        save(dto);

        return ResourceBundleLanguage.periodMessage(Language.getLanguage(lang), "ready");
    }

    @Override
    public List<SizeListResponse> getSizeList() {
        return rep.findALLName();
    }
}

