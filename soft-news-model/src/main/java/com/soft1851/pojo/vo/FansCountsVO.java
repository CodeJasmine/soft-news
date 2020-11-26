package com.soft1851.pojo.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wususu
 * @date 2020/11/26 21:43
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FansCountsVO {
    private Integer manCounts;
    private Integer womanCounts;
}