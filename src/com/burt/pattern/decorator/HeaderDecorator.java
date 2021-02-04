package com.burt.pattern.decorator;

public class HeaderDecorator extends PrintDecorator {

    public HeaderDecorator(String text, PrintComponent printComponent) {
        this.text = text;
        this.printComponent = printComponent;
    }

    @Override
    public void print() {
        Printer.printHeader(text);

        // 嵌套执行 todo
        printComponent.print();
    }
}
