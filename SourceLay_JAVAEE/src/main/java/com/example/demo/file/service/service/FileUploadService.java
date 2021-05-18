package com.example.demo.file.service.service;

import com.example.demo.data.model.SourcelayFileInfo;

import java.util.Map;

public interface FileUploadService {
    String getUploadUrl(String key, int minutes);
    String afterUpload(SourcelayFileInfo sourcelayFileInfo);
    Map<String, Object> requestUpload(Map<String, Object> map);
    Boolean insureUploadSuccess(Long id);

}
