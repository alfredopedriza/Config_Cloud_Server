/*
package com.client;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.environment.EnvironmentChangeEvent;
import org.springframework.cloud.context.scope.refresh.RefreshScopeRefreshedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;


@Service
public class MyRefreshListener implements ApplicationListener<EnvironmentChangeEvent> {

    @Autowired
    RefreshScopedService refreshScopedService;

    @Override
    public void onApplicationEvent(EnvironmentChangeEvent event) {

        if(event.getKeys().contains("config1") /* && event.getKeys().contains("spring.config2") && event.getKeys().contains("spring.config3")*/ /*) {
            refreshScopedService.refresh();
        }
        else if(event.getKeys().contains("config2")) {
            refreshScopedService.refresh();
        }
        else if(event.getKeys().contains("config3")) {
            refreshScopedService.refresh();
        }
    }
}


          */