package com.cto.cloud.controller;

import com.cto.cloud.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * 
 * @author Zhang Wei
 * @date 2020/5/23 15:08
 * @version v1.0.1
 */
@RestController
@RequestMapping("/provider")
public class IndexController {


    @Autowired
    private ProviderService providerService;

    @GetMapping(value = "/getData")
    public String getData(){
        return providerService.getDataOk();
    }

    @GetMapping(value = "/getDataError")
    public String getDataError(){
        return providerService.getDataError();
    }
}
