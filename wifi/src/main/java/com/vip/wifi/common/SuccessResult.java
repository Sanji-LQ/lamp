package com.vip.wifi.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SuccessResult<T> implements Result, Serializable {
    private T Data;
    private Integer status;
    private String msg;

    public static SuccessResult success() {
        return SuccessResult.builder().msg(ResponseStatus.SUCCESS.getMsg()).status(ResponseStatus.SUCCESS.getStatus()).build();
    }


    public static <T> SuccessResult success(T data) {
        return SuccessResult.builder().msg(ResponseStatus.SUCCESS.getMsg()).status(ResponseStatus.SUCCESS.getStatus()).Data(data).build();
    }

}