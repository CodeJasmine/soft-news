package com.soft1851.utils;

/**
 * @author wususu
 * @date 2020/11/24 0:13
 */

public enum FaceVerifyType {
    BASE64(1, "图片Base64对比"),
    IMAGE_URL(0, "URL图片地址对比");

    public final Integer type;
    public final String value;

    FaceVerifyType(Integer type, String value) {
        this.type = type;
        this.value = value;
    }
}
