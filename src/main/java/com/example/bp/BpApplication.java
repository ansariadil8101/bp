package com.example.bp;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class BpApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(BpApplication.class)
//                .bannerMode(Banner.Mode.OFF)
                .build()
                .run(args);
    }

}
