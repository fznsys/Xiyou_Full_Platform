package com.fznsys.xiyou_full_platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class XiyouFullPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiyouFullPlatformApplication.class, args);
    }

}
