package com.ankers.exception;

import com.ankers.vo.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class exceptionAdvice {

    @ExceptionHandler(Exception.class)
    public Result doException() {
        return new Result(1000, "项目出错了", null);
    }
}
