package com.sfujimoto.controllers;

/* sfujimoto: 2017/03/20 15:42 */

import com.sfujimoto.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    private HelloWorldService helloWorldService;

    @Autowired
    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public String sayHello(){

        String greeting = helloWorldService.getGreeting();

        System.out.println(greeting);

        return greeting;

    };
}


