package com.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

/*

@RefreshScope
@Service
public class TestService {

    @Value("${test.value}")
    private String prop1;

    public String getValueWithDelay() {
        try {
            Thread.sleep(30000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return prop1;
    }

    public String getValue() {
        return prop1;
    }
}

 */

/*
@Service
public class TestService {
    private final TestConfiguration testConfiguration;

    public TestService(TestConfiguration testConfiguration) {
        this.testConfiguration = testConfiguration;
    }

    public String getValueWithDelay() {
        try {
            Thread.sleep(30000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return testConfiguration.getValue();
    }

    public String getValue() {
        return testConfiguration.getValue();
    }
}

 */