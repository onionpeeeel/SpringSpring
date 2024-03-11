package com.spring.weather.web.login.service;

import com.spring.weather.web.login.mapper.LoginMapper;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.stereotype.Service;

@Transactional
@RequiredArgsConstructor
@Slf4j
@Service
public class LoginService {

    private static final String rolePrefix = "ROLE_";

    private final LoginMapper loginMapper;

    private final AuthenticationManagerBuilder authenticationManagerBuilder;

}
