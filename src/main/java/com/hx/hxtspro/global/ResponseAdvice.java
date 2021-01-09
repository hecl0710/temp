package com.hx.hxtspro.global;

import com.alibaba.fastjson.JSON;
import com.hx.hxtspro.controller.SysUserController;
import com.hx.hxtspro.enums.ResponseEnums;
import com.hx.hxtspro.exception.BizException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.util.Objects;

@RestControllerAdvice(basePackages = "com.hx.hxtspro")
@Slf4j
public class ResponseAdvice implements ResponseBodyAdvice {
    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        if(methodParameter.getMethod().getName().equals("querySource"))
            return false;
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType,
                                  Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        log.info("待响应：{}",JSON.toJSONString(o));
        if(o instanceof ResponseData)
            return o;
        if(Objects.isNull(o))
            return ResponseData.success();
        return ResponseData.success(o);
    }

    @ExceptionHandler(BizException.class)
    public ResponseData bizExceptionHandle(BizException bizException){
        log.error("业务处理异常->{}:{}",bizException.getCode(),bizException.getMsg(),bizException);
        return ResponseData.fail(bizException.getCode(),bizException.getMsg());
    }

    @ExceptionHandler(Exception.class)
    public ResponseData exceptionHandle(Exception exception){
        log.error("系统处理异常：", exception);
        return ResponseData.fail(ResponseEnums.UNKNOWN_ERROR.getCode(),ResponseEnums.UNKNOWN_ERROR.getMsg());
    }
}
