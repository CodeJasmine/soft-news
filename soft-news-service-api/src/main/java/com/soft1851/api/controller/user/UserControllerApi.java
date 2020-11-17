package com.soft1851.api.controller.user;

import com.soft1851.pojo.bo.UpdateUserInfoBO;
import com.soft1851.result.GraceResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author wususu
 * @date 2020/11/14 22:20
 */
@Api(value = "用户信息相关Controller", tags = "用户信息相关Controller")
@RequestMapping("user")
public interface UserControllerApi {

    /**
     * 获取所有的用户
     *
     * @return
     */
    @ApiOperation(value = "获得所有用户信息", notes = "获得所有用户信息", httpMethod = "GET")
    @GetMapping("/users")
    Object getUsers();

    /**
     * 获得用户基本信息
     *
     * @param userId 用户id
     * @return
     */
    @ApiOperation(value = "获得用户账户信息", notes = "获得用户账户信息", httpMethod = "GET")
    @PostMapping("/userInfo")
    GraceResult geyUserInfo(@RequestParam String userId);


    /**
     * 完善用户信息
     *
     * @param updateUserInfoBO
     * @param result
     * @return
     */
    @PostMapping("/updateUserInfo")
    @ApiOperation(value = "完善用户信息", notes = "完善用户信息", httpMethod = "POST")
    GraceResult updateUserInfo(@RequestBody @Valid UpdateUserInfoBO updateUserInfoBO, BindingResult result);

    /**
     * 获得用户基础信息
     *
     * @param userId 用户id
     * @return
     */
    @PostMapping("/userBasicInfo")
    @ApiOperation(value = "获得用户基础信息", notes = "获得用户基础信息", httpMethod = "POST")
    GraceResult getUserBasicInfo(@RequestParam String userId);


    @PostMapping("/follow")
    @ApiOperation(value = "测试", notes = "测试", httpMethod = "POST")
    GraceResult follow();

}
