package com.burt.pattern.factory;

/**
 * Car
 *
 * @author xujianbo
 * @date 2021/3/11 10:24 上午
 * @since 1.0.0
 */
public class Car extends Vehicle {
    @Override
    void go() {
        System.out.println("car run on the road");
    }
}
