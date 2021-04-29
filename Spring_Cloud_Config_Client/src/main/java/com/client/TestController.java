/*package com.client;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@Controller
@RestController("/test")
public class TestController {

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/v1")
    public String test() {
        return testService.getValueWithDelay();
    }

    @GetMapping("/v2")
    public String test2()  {
        return testService.getValue();
    }
}

 */