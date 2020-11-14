package com.soft1851.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wususu
 * @date 2020/11/14 20:26
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public Object hello(){
        return "hello";
    }
}
