package com.soft1851.enums;

/**
 * @author wususu
 * @date 2020/11/24 22:17
 */
/**
 * @Desc: 是否 枚举
 */
public enum YesOrNo {
    NO(0,"否"),
    YES(1,"是");
    public final Integer type;
    public final String value;

    YesOrNo(Integer type, String value) {
        this.type = type;
        this.value = value;
    }
}

