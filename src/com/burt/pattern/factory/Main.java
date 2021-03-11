package com.burt.pattern.factory;

/**
 * Main
 * 工厂模式
 *
 * @author xujianbo
 * @date 2021/3/11 12:33 上午
 * @since 1.0.0
 */
public class Main {
    public static void main(String[] args) {

        // 抽象工厂
        AbstractFactory factory = new ModernFactory();

//        AbstractFactory factory = new MageFactory();


        factory.createCloth().wear();
        factory.createVehicle().go();
        factory.createWeapon().attack();


        // 工厂方法


    }

}
