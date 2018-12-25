package com.xzc.blog.domain.dto;

import java.io.Serializable;

/**
 * @Classname BlogResult
 * @Description TODO 全局ajax请求返回类,返回json类型
 * @Date 2018/12/22 16:43
 * @Created by xzcawl
 */
public class BlogResult<T> implements Serializable{
    private static final long serialVersionUID = -7857127849510459490L;

    private boolean success;//调用是否成功

    private T data;//返回的数据

    private String error;//错误详情

    public BlogResult() {
    }

    public BlogResult(boolean success, String error) {
        this.success = success;
        this.error = error;
    }

    public BlogResult(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "BlogResult{" +
                "success=" + success +
                ", data=" + data +
                ", error='" + error + '\'' +
                '}';
    }
}
