package com.tang.cn.utils;

import lombok.Data;


/**
 * @author tangchaochao
 * @create 2020-2020-09-02 15:11
 */
@Data
public class ReturnResult<T>  {
    private String msg;
    private int code;
    private T data;
}
