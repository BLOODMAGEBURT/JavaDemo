package com.burt.pattern.factory;

/**
 * AbstractFactory
 *
 * @author xujianbo
 * @date 2021/3/11 10:17 上午
 * @since 1.0.0
 */
public abstract class AbstractFactory {

    abstract Vehicle createVehicle();

    abstract Weapon createWeapon();

    abstract Cloth createCloth();
}
