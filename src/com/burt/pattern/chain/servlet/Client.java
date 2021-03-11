package com.burt.pattern.chain.servlet;

/**
 * Client
 *
 * @author xujianbo
 * @date 2021/3/11 4:48 下午
 * @since 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        Request request = new Request();
        request.requestBody = "request body is full";

        Response response = new Response();
        response.ResponseBody = "response body is full too";

        FilterChain filterChain = new FilterChain();
        filterChain.add(new HtmlFilter());

        filterChain.doFilter(request, response, filterChain);


        System.out.println(request.requestBody);
    }
}
