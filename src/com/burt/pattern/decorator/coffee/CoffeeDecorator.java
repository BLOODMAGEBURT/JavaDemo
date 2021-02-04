package com.burt.pattern.decorator.coffee;

public abstract class CoffeeDecorator implements ICoffee {

    private ICoffee iCoffee;

    public CoffeeDecorator(ICoffee iCoffee) {
        this.iCoffee = iCoffee;
    }

    @Override
    public void makeCoffee() {
        iCoffee.makeCoffee();
    }
}
