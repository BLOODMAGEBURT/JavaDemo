package com.burt.pattern.chain.servlet;

/**
 * Request
 *
 * @author xujianbo
 * @date 2021/3/11 3:43 下午
 * @since 1.0.0
 */
public class Request {
    public int code;
    public String requestBody;

    public void setRequestBody(String requestBody) {
        this.requestBody = requestBody;
    }
}
