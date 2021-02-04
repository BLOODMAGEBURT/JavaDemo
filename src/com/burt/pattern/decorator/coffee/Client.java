package com.burt.pattern.decorator.coffee;

public class Client {
    public static void main(String[] args) {
        OriginCoffee originCoffee = new OriginCoffee();
        originCoffee.makeCoffee();
        System.out.println("");

        MilkDecorator milkDecorator = new MilkDecorator(originCoffee);
        milkDecorator.makeCoffee();
        System.out.println("");

        SugarDecorator sugarDecorator = new SugarDecorator(milkDecorator);
        sugarDecorator.makeCoffee();
    }
}
