package com.vip.wifi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.vip.wifi.mapper")
public class WifiApplication {

    public static void main(String[] args) {
        SpringApplication.run(WifiApplication.class, args);
    }

}
