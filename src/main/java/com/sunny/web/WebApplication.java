package com.sunny.web;

import com.sunny.web.main.Controller.MainController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebApplication {

    public static void main(String[] args) {
//        System.setProperty("server.servlet.context-path", "/WEB-INF");
        SpringApplication.run(WebApplication.class, args);
    }

}
