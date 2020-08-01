package com.ssd.gem.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

//@Component
//@Configuration
@EnableScheduling
public class OneTask {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Scheduled(fixedRate = 1000 * 3)
    private void test() {
        logger.info("任务执行："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }

}
