package com.burt.pattern.chain.filter;

import com.burt.pattern.chain.Msg;

/**
 * SensitiveFilter
 *
 * @author xujianbo
 * @date 2021/3/11 2:17 下午
 * @since 1.0.0
 */
public class SensitiveFilter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        String replace = msg.getMsg()
                .replace("996", "955");

        msg.setMsg(replace);
        return false;
    }
}
