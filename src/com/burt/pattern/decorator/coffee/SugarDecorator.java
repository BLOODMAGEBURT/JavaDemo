package com.burt.pattern.decorator.coffee;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(ICoffee iCoffee) {
        super(iCoffee);
    }

    @Override
    public void makeCoffee() {
        super.makeCoffee();
        addSugar();
    }

    private void addSugar() {
        System.out.print("加糖");
    }
}
