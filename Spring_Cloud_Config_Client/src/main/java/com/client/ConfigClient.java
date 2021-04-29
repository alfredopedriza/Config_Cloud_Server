
package com.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
@RefreshScope


public class ConfigClient {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClient.class, args);
    }
}

/*
    @Value("${spring.config1}")
    private String prop1;

    @Value("${spring.config2}")
    private String prop2;

    @Value("${spring.config3}")
    private String prop3;

    @RequestMapping(
            value = "/propiedades/{user}",
            produces = MediaType.TEXT_PLAIN_VALUE)
    public String propiedades(@PathVariable("user") String user) {
        return String.format("Mis propiedades del perfil dev son: \n %s : %s \n %s : %s \n %s : %s \n ", "spring.config1", prop1, "spring.config2", prop2, "spring.config3", prop3);


    }


}

 */