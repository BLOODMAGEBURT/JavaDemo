package com.burt.pattern.chain.servlet;

/**
 * Response
 *
 * @author xujianbo
 * @date 2021/3/11 3:44 下午
 * @since 1.0.0
 */
public class Response {
    public int code;
    public String ResponseBody;

    public void setResponseBody(String responseBody) {
        ResponseBody = responseBody;
    }
}
