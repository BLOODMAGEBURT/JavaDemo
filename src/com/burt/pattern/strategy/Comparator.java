package com.burt.pattern.strategy;

/**
 * Comparator
 *
 * @author xujianbo
 * @date 2021/3/10 11:24 下午
 * @since 1.0.0
 */
public interface Comparator<T> {
    int compare(T o1, T o2);
}
