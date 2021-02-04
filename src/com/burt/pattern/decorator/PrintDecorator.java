package com.burt.pattern.decorator;

public abstract class PrintDecorator extends PrintComponent {

    PrintComponent printComponent;

    public PrintDecorator(PrintComponent printComponent) {
        this.printComponent = printComponent;
    }

    abstract public void print();

}
