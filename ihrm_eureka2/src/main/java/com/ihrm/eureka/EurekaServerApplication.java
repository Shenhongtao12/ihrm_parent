package com.ihrm.eureka;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka服务端的启动类
 */
@SpringBootApplication
@EnableEurekaServer //开启eureka服务端配置
public class EurekaServerApplication {

    public static void main(String[] args) {
        //new SpringApplicationBuilder(EurekaServerApplication.class).run(args);
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
