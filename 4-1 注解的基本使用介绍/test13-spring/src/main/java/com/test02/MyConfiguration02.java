package com.test02;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 第1种注解--把整个包都注解
 * @Configuration 组态
 * @ComponentScan 组件扫描
 */
@Configuration
@ComponentScan(value = "com.test02")
public class MyConfiguration02 {
}
