package com.codingshuttle.anee.module1Introduction.impl;

import com.codingshuttle.anee.module1Introduction.NotificationService;
import org.springframework.stereotype.Component;

@Component
public class SmsNotificationService implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("Sms sending... " + message);
    }
}
