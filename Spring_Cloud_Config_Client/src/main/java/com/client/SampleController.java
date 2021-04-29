
package com.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.crypto.Cipher;
import java.util.HashMap;
import java.util.Map;


@RestController
@RefreshScope
@RequestMapping(value="/api" ,method=RequestMethod.GET)
public class SampleController {

    @Value("${spring.config1}")
    private String configA;

    @Value("${spring.config2}")
    private String configB;

    @Value("${spring.config3}")
    private String configC;

    @GetMapping("/configs")
    public Map<String, Object> getConfigData() {
        Map<String, Object> objectMap = new HashMap<>();
        objectMap.put("spring.config1", configA);
        objectMap.put("spring.config2", configB);
        objectMap.put("spring.config3", configC);
        return objectMap;

    }
}

