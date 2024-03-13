package com.spring.weather.web.batch.model;

import lombok.Data;

@Data
public class BatchVO {

    private String firstReg;        // 1단계 주소
    private String secReg;          // 2단계 주소
    private Integer xCoord;         // x 좌표
    private Integer yCoord;         // y 좌표

    private String skyStatus;       // 기상 상태
    private String data;            // 관측 날짜
    private String time;            // 관측 시간
    private String region;          // 관측 지역
    private String temperature;     // 온도
    private String humidity;        // 습도
    private String windSpeed;       // 풍속
    private String windVol;         // 풍향
    private String rainfall;        // 강수량
    private String proRainfall;     // 강수 확률
}
