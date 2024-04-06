package com.example.my_dodo.microservices;

import com.example.my_dodo.model.response.FileServiceUploadResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

@FeignClient(name = "file", url = "localhost:8090")
public interface FileService {

    @PostMapping( value = "/api/v1/file/upload", consumes = "multipart/form-data")
    FileServiceUploadResponse upload(@RequestPart MultipartFile file);


}
