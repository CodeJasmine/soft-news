package com.soft1851.enums;

/**
 * @author wususu
 * @date 2020/11/24 22:15
 */
/**
 * @Desc:文章封面类型 枚举
 */
public enum ArticleCoverType {

    ONE_IMAGE(1, "单图"),
    WPRDS(2, "纯文字");

    public final Integer type;
    public final String value;

    ArticleCoverType(Integer type, String value) {
        this.type = type;
        this.value = value;
    }
}
