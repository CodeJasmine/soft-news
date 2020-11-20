package com.soft1851.pojo.bo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wususu
 * @date 2020/11/20 23:23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NewAdminBO {
    private String username;
    private String adminName;
    private String password;
    private String confirmationPassword;
    private String img64;
    private String faceId;
}

