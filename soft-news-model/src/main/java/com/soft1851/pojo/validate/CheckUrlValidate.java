package com.soft1851.pojo.validate;


import com.soft1851.utils.UrlUtil;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author wususu
 * @date 2020/11/24 21:21
 */
public class CheckUrlValidate implements ConstraintValidator<com.soft1851.pojo.validate.CheckUrl, String> {

    @Override
    public boolean isValid(String url, ConstraintValidatorContext constraintValidatorContext) {
        return UrlUtil.verifyUrl(url.trim());
    }
}
