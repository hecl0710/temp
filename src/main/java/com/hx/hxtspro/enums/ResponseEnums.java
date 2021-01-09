package com.hx.hxtspro.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResponseEnums {
    SUCCESS_RESPONSE("0000","处理成功"),
    UNKNOWN_ERROR("9999","未知错误");
    private String code;
    private String msg;
}
