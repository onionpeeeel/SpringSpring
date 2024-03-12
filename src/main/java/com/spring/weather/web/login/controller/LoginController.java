package com.spring.weather.web.login.controller;

import com.spring.weather.web.login.model.LoginVO;
import com.spring.weather.web.login.service.LoginService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@Slf4j
@RestController
@RequestMapping(path = "/api/login")
public class LoginController {

    private final LoginService loginService;

    @GetMapping("/getUserInfo")
    public ResponseEntity<Map<String, Object>> getUserInfo(@ModelAttribute LoginVO loginVO) throws Exception {

        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("success", true);

        // 회원정보 검증 및 토큰 생성
        LoginVO userInfo = loginService.findLoginUserInfo(loginVO.getUserId(), loginVO.getUserPwd());

        if (ObjectUtils.isEmpty(userInfo)) {
            resultMap.put("success", false);
            return ResponseEntity.ok(resultMap);
        }

        resultMap.put("userInfo", userInfo);

        return ResponseEntity.ok(resultMap);
    }
}
