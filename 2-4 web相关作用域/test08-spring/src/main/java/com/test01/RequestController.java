package com.test01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RequestController {
    @RequestMapping("testRequest")
    @ResponseBody
    public String test(){
        return this.toString();
    }
}
