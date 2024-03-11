package com.spring.weather.common.config;

import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

// AppConfig 설정을 구성
@Configuration
public class AppConfig {

    private final AutowireCapableBeanFactory beanFactory;

    public AppConfig(AutowireCapableBeanFactory beanFactory) { this.beanFactory = beanFactory; }

    /*
    * Spring Security 암호화 Encoder
    * */

    // @Bean = 스프링 컨테이너에 등록
    @Bean
    public BCryptPasswordEncoder passwordEncoder() { return new BCryptPasswordEncoder(); }
}
