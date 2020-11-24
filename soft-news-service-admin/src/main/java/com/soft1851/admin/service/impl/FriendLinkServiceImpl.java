package com.soft1851.admin.service.impl;

import com.soft1851.admin.repository.FriendLinkRepository;
import com.soft1851.admin.service.FriendLinkService;
import com.soft1851.pojo.mo.FriendLinkMO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wususu
 * @date 2020/11/24 21:27
 */
@Service
public class FriendLinkServiceImpl implements FriendLinkService {
    @Autowired
    private FriendLinkRepository friendLinkRepository;

    @Override
    public void saveOrUpdateFriendLink(FriendLinkMO friendLinkMO) {
        friendLinkRepository.save(friendLinkMO);
    }

    @Override
    public List<FriendLinkMO> queryAllFriendList() {
        return friendLinkRepository.findAll();
    }

    @Override
    public void delete(String linkId) {
        friendLinkRepository.deleteById(linkId);
    }
}
