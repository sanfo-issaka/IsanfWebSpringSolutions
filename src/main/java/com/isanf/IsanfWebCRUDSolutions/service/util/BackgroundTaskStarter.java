package com.isanf.IsanfWebCRUDSolutions.service.util;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.isanf.IsanfWebCRUDSolutions.service.MonService;


//R 6
@Component
public class BackgroundTaskStarter implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        // Start a background task after the context has been initialized or refreshed.
        startBackgroundTask();
    }

    private void startBackgroundTask() {
    	
        System.out.println("******************************  :  Starting background task...");
        
    }
}

