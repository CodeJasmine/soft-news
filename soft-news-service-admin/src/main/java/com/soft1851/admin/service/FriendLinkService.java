package com.soft1851.admin.service;

import com.soft1851.pojo.mo.FriendLinkMO;

import java.util.List;

/**
 * @author wususu
 * @date 2020/11/24 21:27
 */
public interface FriendLinkService {
    /**
     * 新增或者更新友链
     *
     * @param friendLinkMO 入参
     */
    void saveOrUpdateFriendLink(FriendLinkMO friendLinkMO);


    /**
     * 查询友情连接
     *
     * @return
     */
    List<FriendLinkMO> queryAllFriendList();


    /**
     * 删除友情链接
     */
    void delete(String linkId);
}

