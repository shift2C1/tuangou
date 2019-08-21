package com.eg.test.Timer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class TestSchduled {


//    String cron="";
    @Scheduled(cron = "${time_cron}")
    public void Test(){
        log.info("****");
    }
}
