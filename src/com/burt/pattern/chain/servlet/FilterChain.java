package com.burt.pattern.chain.servlet;

import java.util.ArrayList;
import java.util.List;

/**
 * FilterChain
 *
 * @author xujianbo
 * @date 2021/3/11 3:45 下午
 * @since 1.0.0
 */
public class FilterChain implements Filter {

    List<Filter> filters = new ArrayList<>();

    public FilterChain add(Filter filter) {
        filters.add(filter);
        return this;
    }

    @Override
    public boolean doFilter(Request request, Response response, FilterChain filterChain) {

        for (Filter filter : filters) {
            if (!filter.doFilter(request, response, filterChain)) return false;
        }


        return false;
    }
}
