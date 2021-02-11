package com.shopping.shoppingmalleureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class ShoppingMallEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingMallEurekaApplication.class, args);
    }

}
