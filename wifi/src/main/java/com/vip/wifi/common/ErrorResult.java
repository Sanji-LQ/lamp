package com.vip.wifi.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ErrorResult implements Result{
    private Integer status;
    private String msg;

    public static ErrorResult error(){
        return ErrorResult.builder().msg(ResponseStatus.SYSTEM_INNER_ERROR.getMsg()).status(ResponseStatus.SYSTEM_INNER_ERROR.getStatus()).build();
    }

    public static ErrorResult error(ResponseStatus responseStatus){
        return ErrorResult.builder().msg(ResponseStatus.SYSTEM_INNER_ERROR.getMsg()).status(ResponseStatus.SYSTEM_INNER_ERROR.getStatus()).build();
    }
}
