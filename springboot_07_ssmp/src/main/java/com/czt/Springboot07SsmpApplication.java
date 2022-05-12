package com.czt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot07SsmpApplication {

    public static void main(String[] args) {
        String[] arg = new String[1];
        arg[0] = "--server.port=8082";
        SpringApplication.run(Springboot07SsmpApplication.class, arg);
        //SpringApplication.run(Springboot07SsmpApplication.class);
        //SpringApplication.run(Springboot07SsmpApplication.class, args);
    }

}
