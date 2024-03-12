package com.spring.weather.web.login.mapper;

import com.spring.weather.web.login.model.LoginVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {

    LoginVO selectLoginInfo(String userId);
}
