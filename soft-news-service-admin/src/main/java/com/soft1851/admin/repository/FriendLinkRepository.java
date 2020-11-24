package com.soft1851.admin.repository;

import com.soft1851.pojo.mo.FriendLinkMO;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author wususu
 * @date 2020/11/24 21:26
 */
public interface FriendLinkRepository extends MongoRepository<FriendLinkMO,String> {
    /**
     * 根据是否删除字段查询所有友链
     * @param isDelete 是否删除
     * @return
     */
    List<FriendLinkMO> getAllByIsDelete(Integer isDelete);
}
