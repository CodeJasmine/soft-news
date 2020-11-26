package com.soft1851.enums;

/**
 * @author wususu
 * @date 2020/11/24 22:15
 */
/**
 * @Desc: 文章发布操作类型 枚举
 */
public enum ArticleAppointType {
    TIMING(1, "文章定时发布——定时"),
    IMMEDIATELY(0, "文章立即发布——即使");

    public final Integer type;
    public final String value;

    ArticleAppointType(Integer type, String value) {
        this.type = type;
        this.value = value;
    }
}

