package com.iFox.hh;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * 启动类
 *
 * @author exphuhong
 * @since 16:33 2018/5/19
 */

@SpringBootApplication
public class Application extends WebMvcConfigurationSupport{

    @Override
    public void addCorsMappings(CorsRegistry registry) {

        registry.addMapping("/**")
                .allowCredentials(true)
                .allowedHeaders("*")
                .allowedOrigins("*")
                .allowedMethods("*");

    }

    private static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {

        logger.info("系统启动中");
        SpringApplication.run(Application.class);
    }
}
