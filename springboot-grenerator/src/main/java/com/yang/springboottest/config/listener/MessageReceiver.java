package com.yang.springboottest.config.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver implements ApplicationListener<ApplicationReadyEvent> {
    private Logger logger = LoggerFactory.getLogger(MessageReceiver.class);

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        System.out.println("...ApplicationListener....");
    }
}