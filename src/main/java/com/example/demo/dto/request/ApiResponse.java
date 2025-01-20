package com.example.demo.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ApiResponse<T> {
    private int code =1000;
    private String message;
    private T reusult;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getReusult() {
        return reusult;
    }

    public void setReusult(T reusult) {
        this.reusult = reusult;
    }
}
