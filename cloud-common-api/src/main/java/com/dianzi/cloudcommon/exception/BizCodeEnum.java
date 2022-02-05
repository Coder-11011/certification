package com.dianzi.cloudcommon.exception;


/* 200 （成功） 服务器已成功处理了请求。 通常，这表示服务器提供了请求的⽹⻚。
 * 400 （校验异常）
 * 401 （系统未知异常）
 * 500 （服务器内部错误） 服务器遇到错误，⽆法完成请求
 * 504 （⽹关超时） 服务器作为⽹关或代理
 *
 */

public enum BizCodeEnum {

    //资源微服务错误
    DEP_VALID_EXCEPTION(10400,"资源系统校验异常"),
    DEP_UNKNOWN_EXCEPTION(10401,"资源系统未知异常"),
    //抢修微服务错误
    REP_VALID_EXCEPTION(20400,"抢修系统校验异常"),
    REP_UNKNOWN_EXCEPTION(20401,"抢修系统未知异常");
    private int code;
    private String msg;
    BizCodeEnum(int code,String msg) {
        this.code = code;
        this.msg = msg;
    }
    public int getCode() {
        return code;
    }
    public String getMsg() {
        return msg;
    }

}
