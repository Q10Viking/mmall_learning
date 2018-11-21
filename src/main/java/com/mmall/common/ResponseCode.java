package com.mmall.common;

/**
 * Created by Viking on 2018/11/21.
 */
public enum ResponseCode {
    SUCCESS(0,"SUCESS"),
    ERROR(1,"ERROR"),
    NEED_lOGIN(10,"NEED_LOGIN"),
    ILLEGAL_ARGUMENT(2,"ILLEGAL_ARGUMENT");

    private final int code;
    private final String desc;
    ResponseCode(int code,String desc){
        this.code = code;
        this.desc = desc;
    }

    public int getCode(){
        return code;
    }

    public String getDesc(){
        return desc;
    }
}
