package com.hx.hxtspro.global;

import com.hx.hxtspro.enums.ResponseEnums;
import lombok.Data;

@Data
public class ResponseData<T> {
    String code;
    String msg;
    T data;

    public ResponseData(String code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public ResponseData(String code, String msg, T data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static ResponseData success(){
        return new ResponseData(ResponseEnums.SUCCESS_RESPONSE.getCode(), ResponseEnums.SUCCESS_RESPONSE.getMsg());
    }

    public static<T> ResponseData success(T data){
        return new ResponseData(ResponseEnums.SUCCESS_RESPONSE.getCode(), ResponseEnums.SUCCESS_RESPONSE.getMsg(), data);
    }

    public static ResponseData fail(String code, String msg){
        return new ResponseData(code, msg);
    }
}
