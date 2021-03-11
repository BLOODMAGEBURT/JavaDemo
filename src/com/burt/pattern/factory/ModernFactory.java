package com.burt.pattern.factory;

/**
 * ModernFactory
 *
 * @author xujianbo
 * @date 2021/3/11 10:32 上午
 * @since 1.0.0
 */
public class ModernFactory extends AbstractFactory {
    @Override
    Vehicle createVehicle() {
        return new Car();
    }

    @Override
    Weapon createWeapon() {
        return new AK47();
    }

    @Override
    Cloth createCloth() {
        return new ManSuits();
    }
}
