/*
package com.client;



import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
@RefreshScope
@Getter
@Setter

public class RefreshScopedService {

    @Value("${spring.config1}")
    String config1;

    @Value("${spring.config2}")
    String config2;

    @Value("${spring.config3}")
    String config3;

    String responseMessage;

    @PostConstruct
    public void refresh(){
        responseMessage = responseMessage = " " + config1 + config2 + config3;
    }



}

 */