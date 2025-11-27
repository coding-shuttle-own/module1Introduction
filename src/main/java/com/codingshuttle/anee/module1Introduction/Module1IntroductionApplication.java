package com.codingshuttle.anee.module1Introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class Module1IntroductionApplication implements CommandLineRunner {

//    @Autowired
    final NotificationService notificationServiceObj; // dependency injection

    public Module1IntroductionApplication(@Qualifier("emailNotify") NotificationService notificationServiceObj) {
        this.notificationServiceObj = notificationServiceObj; // constructor DI (Preferred)
    }

//    @Autowired
//    Map<String, NotificationService> notificationServiceMap = new HashMap<>(); // to get all beans of type NotificationService

    public static void main(String[] args) {
		SpringApplication.run(Module1IntroductionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		notificationServiceObj.send("hello");

//        for (var notificationServiceEntry : notificationServiceMap.entrySet()) {
//            System.out.println("Key: " + notificationServiceEntry.getKey());
//            notificationServiceEntry.getValue().send("Hello via " + notificationServiceEntry.getKey());
//        }
	}
}
