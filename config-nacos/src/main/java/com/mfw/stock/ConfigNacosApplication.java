package com.mfw.stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class ConfigNacosApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ConfigNacosApplication.class, args);
        ConfigurableEnvironment environment = run.getEnvironment();
        String name = environment.getProperty("user.name");
        String age = environment.getProperty("user.age");
        System.out.println("name:" + name + ",age:" + age);
    }
}
