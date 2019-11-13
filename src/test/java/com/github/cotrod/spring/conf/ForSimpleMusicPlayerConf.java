package com.github.cotrod.spring.conf;

import com.github.cotrod.spring.model.impl.SimpleMusicPlayerJavaConf;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ForSimpleMusicPlayerConf {
    @Bean
    SimpleMusicPlayerJavaConf simpleMusicPlayer(){
        return new SimpleMusicPlayerJavaConf();
    }
}
