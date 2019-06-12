package com.test01;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "bean01")
@Scope(value = "singleton")
public class Bean01 {
}
