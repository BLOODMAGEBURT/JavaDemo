package com.burt.pattern.factory;

/**
 * Pc
 *
 * @author xujianbo
 * @date 2021/3/11 11:06 上午
 * @since 1.0.0
 */
public class Pc extends Computer {
    @Override
    void compute() {
        System.out.println("little compute");
    }
}
