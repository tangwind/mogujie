package com.tang.cn.utils;

import java.util.UUID;

/**
 * @author tangchaochao
 * @create 2020-2020-09-03 17:08
 */
public class UUIDUtils {

    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-", "").trim().substring(0, 15);
    }
    public static String createOid(String gId) {
        String oIdPrefix = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 5);
        String timeStr = String.valueOf(System.currentTimeMillis());
        int timeLength = timeStr.length();
        timeStr.substring(timeLength - 16,timeLength);
        return oIdPrefix + timeStr + gId;
    }

    public static String createNonceStr() {
        return UUID.randomUUID().toString().replace("-","").substring(0, 32);
    }

}
