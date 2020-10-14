package com.tang.cn.param;

import lombok.Data;

import java.io.Serializable;

/**
 * @author tangchaochao
 * @create 2020-2020-10-14 16:31
 */
@Data
public class UserParam implements Serializable {
    private String name;
    private String id;
}
