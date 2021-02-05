package com.burt.laoma.dynamicbinding;

/**
 * Client
 *
 * @author xujianbo
 * @date 2021/2/5 11:51 上午
 * @since 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        Father child = new Child();
//        child.run();
        child.walk();
    }
}
