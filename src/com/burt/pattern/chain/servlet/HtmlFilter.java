package com.burt.pattern.chain.servlet;

/**
 * HtmlFilter
 *
 * @author xujianbo
 * @date 2021/3/11 4:50 下午
 * @since 1.0.0
 */
public class HtmlFilter implements Filter {
    @Override
    public boolean doFilter(Request request, Response response, FilterChain chain) {

        // 调整 request
        request.setRequestBody(request.requestBody.replace("full", "empty"));

        chain.doFilter(request, response, chain);

        // 调整 response
        response.setResponseBody(response.ResponseBody.replace("full", "empty"));

        return true;
    }
}
