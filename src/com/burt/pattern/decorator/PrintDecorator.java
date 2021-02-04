package com.burt.pattern.decorator;

public abstract class PrintDecorator extends PrintComponent {
    String text;
    PrintComponent printComponent;
    abstract public void print();

}
