package com.burt.pattern.factory;

/**
 * MageFactory
 *
 * @author xujianbo
 * @date 2021/3/11 10:30 上午
 * @since 1.0.0
 */
public class MageFactory extends AbstractFactory {
    @Override
    Vehicle createVehicle() {
        return new MageBroom();
    }

    @Override
    Weapon createWeapon() {
        return new MageStick();
    }

    @Override
    Cloth createCloth() {
        return new MageRobe();
    }
}
