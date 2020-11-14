package com.soft1851.user.controller;

import com.soft1851.api.controller.user.HelloControllerApi;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wususu
 * @date 2020/11/14 20:26
 */
@RestController
public class HelloController implements HelloControllerApi {
    @Override
    public Object hello(){
        return "hello";
    }
}
