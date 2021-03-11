package com.burt.pattern.chain.filter;

import com.burt.pattern.chain.Msg;

/**
 * HtmlFilter
 *
 * @author xujianbo
 * @date 2021/3/11 2:16 下午
 * @since 1.0.0
 */
public class HtmlFilter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        String r = msg.getMsg()
                .replace("<", "[")
                .replace(">", "]");
        msg.setMsg(r);
        return true;
    }
}
