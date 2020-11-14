package com.soft1851.api.controller.user;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author wususu
 * @date 2020/11/14 22:20
 */
public interface UserControllerApi {
    /**
     * 获取所有用户
     * @return users：所有用户信息
     */
    @GetMapping("/users")
    Object getUsers();
}
