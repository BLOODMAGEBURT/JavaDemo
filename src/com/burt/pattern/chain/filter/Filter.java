package com.burt.pattern.chain.filter;

import com.burt.pattern.chain.Msg;

/**
 * Filter
 *
 * @author xujianbo
 * @date 2021/3/11 2:16 下午
 * @since 1.0.0
 */
public interface Filter {
    boolean doFilter(Msg msg);
}
