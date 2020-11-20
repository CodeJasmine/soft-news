package com.soft1851.pojo.bo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wususu
 * @date 2020/11/20 22:24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AdminLoginBO {
    private String username;
    private String password;
    private String img64;
}
