package com.burt.pattern.factory;

/**
 * AK47
 *
 * @author xujianbo
 * @date 2021/3/11 10:25 上午
 * @since 1.0.0
 */
public class AK47 extends Weapon {
    @Override
    void attack() {
        System.out.println("ak47 shoot bullet");
    }
}
