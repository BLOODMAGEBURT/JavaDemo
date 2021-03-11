package com.burt.pattern.chain.filter;

import com.burt.pattern.chain.Msg;

import java.util.ArrayList;
import java.util.List;

/**
 * FilterChain
 *
 * @author xujianbo
 * @date 2021/3/11 2:31 下午
 * @since 1.0.0
 */
public class FilterChain implements Filter {
    List<Filter> filters = new ArrayList<>();

    public FilterChain add(Filter filter) {
        filters.add(filter);
        return this;
    }


    @Override
    public boolean doFilter(Msg msg) {
        for (Filter filter : filters) {
            if (!filter.doFilter(msg)) return false;
        }
        return true;
    }

    // 由FilterChain中的某一个filter决定，链条是否继续执行

}
