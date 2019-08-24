package com.cap2.controller;

import com.cap2.config.JamesTypeFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Controller
@ComponentScan(value="com.cap2", includeFilters={
        @ComponentScan.Filter(type= FilterType.CUSTOM, classes={JamesTypeFilter.class})
}, useDefaultFilters=false)
public class OrderController {
}
