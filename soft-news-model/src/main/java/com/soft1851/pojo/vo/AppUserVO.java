package com.soft1851.pojo.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wususu
 * @date 2020/11/18 5:04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AppUserVO {
    private String id;
    private String nickname;
    private String face;
    /**
     * 激活状态
     */
    private Integer activeStatus;

    /**
     * 我的关注数
     */
    private Integer myFollowCount;

    /**
     * 我的粉丝数
     */
    private Integer myFansCounts;
}
