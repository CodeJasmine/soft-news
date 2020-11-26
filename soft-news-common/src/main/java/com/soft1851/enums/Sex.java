package com.soft1851.enums;

/**
 * @author wususu
 * @date 2020/11/26 21:58
 */
public enum Sex {
    /**
     * 性别枚举类
     */
    man(1, "男"),
    woman(0, "女");
    public final Integer type;
    public final String value;

    Sex(Integer type, String value) {
        this.type = type;
        this.value = value;
    }
}
