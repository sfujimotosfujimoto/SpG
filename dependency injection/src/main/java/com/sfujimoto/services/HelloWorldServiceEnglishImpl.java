package com.sfujimoto.services;
/* sfujimoto: 2017/03/20 15:45 */

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("default", "english")
public class HelloWorldServiceEnglishImpl implements HelloWorldService {

    @Override
    public String getGreeting() {
        return "Hello world!!!";
    }
}
