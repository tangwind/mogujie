package com.tang.cn.utils;



/**
 * @author tangchaochao
 * @create 2020-2020-09-02 15:16
 */
public class ReturnResultUtils{

    public static ReturnResult returnSuccess(){
        ReturnResult returnResult = new ReturnResult();
        returnResult.setCode(666);
        returnResult.setMsg("SUCCESS");
        return returnResult;
    }

    public static  <T> ReturnResult returnSuccess(T data){
        ReturnResult returnResult = new ReturnResult();
        returnResult.setCode(666);
        returnResult.setMsg("SUCCESS");
        returnResult.setData(data);
        return returnResult;
    }

    public static ReturnResult returnFail(int code){
        ReturnResult returnResult = new ReturnResult();
        returnResult.setCode(code);
        returnResult.setMsg("FAIL");
        return returnResult;
    }

    public static ReturnResult returnFail(int code, String msg){
        ReturnResult returnResult = new ReturnResult();
        returnResult.setCode(code);
        returnResult.setMsg(msg);
        return returnResult;
    }


}






















