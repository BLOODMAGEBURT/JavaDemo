package com.burt.pattern.chain.servlet;

/**
 * Filter
 *
 * @author xujianbo
 * @date 2021/3/11 3:43 下午
 * @since 1.0.0
 */
interface Filter {
    boolean doFilter(Request request, Response response, FilterChain filterChain);
}
