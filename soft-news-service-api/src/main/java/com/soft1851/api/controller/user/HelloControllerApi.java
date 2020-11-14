package com.soft1851.api.controller.user;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author wususu
 * @date 2020/11/14 20:47
 */
public interface HelloControllerApi {
    /**
     * hello接口
     * @return Object
     */
    @GetMapping("/hello")
    Object hello();
}
