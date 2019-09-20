package com.vip.light.utils.exception;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.vip.light.utils.result.ResponseEntity;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import javax.annotation.Resource;

/**
 * @author zhangwei
 */
@RestControllerAdvice
public class ResponseResultHandlerAdvice implements ResponseBodyAdvice<Object> {
    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType,
                                  Class<? extends HttpMessageConverter<?>> selectedConverterType,
                                  ServerHttpRequest request, ServerHttpResponse response) {

        Object resp = null;
        if (body instanceof ResponseEntity){
            resp = body;
        }else if(body instanceof String){
            resp = body;
        } else{
            resp =  ResponseEntity.success();
        }

        return resp;

    }

}
