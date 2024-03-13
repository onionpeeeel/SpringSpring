package com.spring.weather.web.batch.controller;

import com.spring.weather.web.batch.service.BatchService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@Slf4j
@RequestMapping(path = "/api/Batch")
@EnableScheduling
@RestController
public class BatchController {

    private final BatchService batchService;

    @GetMapping("/getRegionList")
    @Scheduled(cron = "${batch.service.cron}")
    public void getRegionList() {

    }
}
