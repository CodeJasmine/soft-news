package com.soft1851.api;

import com.soft1851.utils.RedisOperator;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author wususu
 * @date 2020/11/15 22:55
 */
public class BaseController {
    @Autowired
    public RedisOperator redis;

    public static final String MOBILE_SMSCODE = "mobile:smscode";
}
