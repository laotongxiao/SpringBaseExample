package com.test02;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 自定义作用域,它是2对象
 */
@Component
@Scope(value = "myScope01")
public class Bean02 {
}
