package com.burt.pattern.factory;

/**
 * MageStick
 *
 * @author xujianbo
 * @date 2021/3/11 10:21 上午
 * @since 1.0.0
 */
public class MageStick extends Weapon {
    @Override
    void attack() {
        System.out.println("release mage to hurt person");
    }
}
