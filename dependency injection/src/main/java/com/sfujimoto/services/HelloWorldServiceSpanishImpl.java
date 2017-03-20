package com.sfujimoto.services;
/* sfujimoto: 2017/03/20 15:52 */

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("spanish")
public class HelloWorldServiceSpanishImpl implements HelloWorldService {
    @Override
    public String getGreeting() {
        return "Hola mundo!!";
    }
}
