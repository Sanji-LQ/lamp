package com.vip.wifi.utils;

import com.vip.wifi.common.ErrorResult;
import com.vip.wifi.common.ResponseStatus;
import com.vip.wifi.common.Result;
import com.vip.wifi.common.ServiceException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.ServletException;

/**
 * @author zhangwei
 */
@ControllerAdvice
@Slf4j
public class ExceptionHandlerAdvice {
    /**
     * 处理未捕获的Exception
     * @param e 异常
     * @return 统一响应体
     */
    @ExceptionHandler(Exception.class)
    public Result handleException(Exception e) {
        if (e instanceof ServiceException) {
            return ErrorResult.error(ResponseStatus.BUSINESS_UNKNOW_ERROR);
        } else if (e instanceof NoHandlerFoundException) {
            return ErrorResult.error(ResponseStatus.NO_FOUND_ERROR);
        } else {
            return ErrorResult.error(ResponseStatus.SYSTEM_UNKNOW_ERROR);
        }
    }
    

}