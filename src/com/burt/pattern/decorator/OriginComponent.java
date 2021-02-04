package com.burt.pattern.decorator;

public class OriginComponent extends PrintComponent {
    private String text;

    public OriginComponent(String text) {

        this.text = text;
    }

    @Override
    public void print() {
        Printer.printText(text);
    }
}
