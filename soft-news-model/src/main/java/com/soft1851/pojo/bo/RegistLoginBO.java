package com.soft1851.pojo.bo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * @author wususu
 * @date 2020/11/16 21:09
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegistLoginBO {
    /**
     * description:@NotNull只校验null值，@NotBlank会同时校验Null和""串
     */
    @NotBlank(message = "手机号不能为空")
    private String mobile;

    @NotBlank(message = "短信验证码不能为空")
    private String smsCode;
}
