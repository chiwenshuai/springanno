package com.cap2.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(value="com.cap2", includeFilters={
        @ComponentScan.Filter(type= FilterType.ANNOTATION, classes={Controller.class})
}, useDefaultFilters=false)
public class config {
}
