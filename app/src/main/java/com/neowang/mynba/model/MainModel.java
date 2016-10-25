package com.neowang.mynba.model;

/**
 * Created by cd14 on 2016/10/11.
 */

public class MainModel<T> {

    /**
     * reason : 查询成功
     * * error_code : 0
     */

    private String reason;
    private int error_code;
    private T result;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
