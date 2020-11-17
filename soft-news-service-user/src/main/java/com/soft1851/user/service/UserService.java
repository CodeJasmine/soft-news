package com.soft1851.user.service;

import com.soft1851.pojo.AppUser;
import com.soft1851.pojo.bo.UpdateUserInfoBO;

/**
 * @author wususu
 * @date 2020/11/16 21:25
 */
public interface UserService {
    /**
     * 判断用户是否存在，如果存在返回user信息
     *
     * @param mobile 手机号
     * @return
     */
    AppUser queryMobileIsExist(String mobile);

    /**
     * 创建用户，新增用户记录到数据库
     *
     * @param mobile 手机号
     * @return
     */
    AppUser createUser(String mobile);

    /**
     * 根据用户主键获得用户信息
     * @param userId 用户Id
     * @return
     */
    public AppUser getUser(String userId);

    void updateUserInfo(UpdateUserInfoBO updateUserInfoBO);
}