package com.burt.pattern.decorator.coffee;

public class OriginCoffee implements ICoffee {
    @Override
    public void makeCoffee() {
        System.out.print("原味咖啡  ");
    }
}
