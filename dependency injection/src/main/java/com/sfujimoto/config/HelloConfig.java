package com.sfujimoto.config;
/* sfujimoto: 2017/03/20 16:26 */

import com.sfujimoto.services.HelloWorldService;
import com.sfujimoto.services.HelloWorldServiceEnglishImpl;
import com.sfujimoto.services.HelloWorldServiceSpanishImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfig {

    // make the HelloWorldServiceEnglishImpl a component
    // with Java Config class (not annotating the class with @Component)
//    @Bean
//    @Profile("english")
//    private HelloWorldService helloWorldServiceEnglish() {
//        return new HelloWorldServiceEnglishImpl();
//    }

//    @Bean
//    @Profile("spanish")
//    public HelloWorldService helloWorldServiceSpanish() {
//        return new HelloWorldServiceSpanishImpl();
//    }


}
