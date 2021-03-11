package com.burt.pattern.chain.filter;

import com.burt.pattern.chain.Msg;

/**
 * UrlFilter
 *
 * @author xujianbo
 * @date 2021/3/11 2:34 下午
 * @since 1.0.0
 */
public class UrlFilter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        String replace = msg.getMsg().replace("http", "https");
        msg.setMsg(replace);
        return true;
    }
}
