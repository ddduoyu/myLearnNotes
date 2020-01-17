package com.example.devtest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {

    @RequestMapping(value = "/sayHello")
    public String sayHello()
    {
        return "Hello World!xxxx哈哈";
    }
}
