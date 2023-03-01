package com.medical.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Description 默认密码枚举
 */
@Getter
@AllArgsConstructor
public enum PwdEnum {

    /**
     * 默认密码
     */
    PASSWORD("123");

    private final String password;
}
