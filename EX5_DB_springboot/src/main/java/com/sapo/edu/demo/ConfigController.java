package com.sapo.edu.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    // Lấy giá trị từ file cấu hình (ví dụ: application.properties hoặc application-dev.properties)
    @Value("${spring.datasource.url}")
    private String datasourceUrl;

    @Value("${spring.application.name}")
    private String appName;


    // API để lấy thông tin cấu hình
    @GetMapping("/config")
    public String getConfig() {
        // Trả về các giá trị cấu hình dưới dạng chuỗi
        return "App Name: " + appName + ", Datasource URL: " + datasourceUrl;
    }
}
