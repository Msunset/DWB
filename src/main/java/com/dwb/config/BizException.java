package com.dwb.config;

import com.dwb.result.ResultCode;

/**
 * @author manke
 * @date 2020-04-22 13:53
 */
public class BizException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * 错误码
     */
    protected Integer errorCode;
    /**
     * 错误信息
     */
    protected String errorMsg;

    public BizException(Integer errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }
    public BizException(ResultCode resultCode) {
        this.errorCode = resultCode.getCode();
        this.errorMsg = resultCode.getMessage();
    }

    public BizException(String message, Integer errorCode, String errorMsg) {
        super(message);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public BizException(String message, Throwable cause, Integer errorCode, String errorMsg) {
        super(message, cause);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public BizException(Throwable cause, Integer errorCode, String errorMsg) {
        super(cause);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public BizException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, Integer errorCode, String errorMsg) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}