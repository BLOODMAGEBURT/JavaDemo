package com.burt.pattern.factory;

/**
 * Server
 *
 * @author xujianbo
 * @date 2021/3/11 11:07 上午
 * @since 1.0.0
 */
public class Server extends Computer {
    @Override
    void compute() {
        System.out.println("big data compute");
    }
}
