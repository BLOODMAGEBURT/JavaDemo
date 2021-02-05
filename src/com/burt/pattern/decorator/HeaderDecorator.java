package com.burt.pattern.decorator;

public class HeaderDecorator extends PrintDecorator {

    private String header;

    public HeaderDecorator(PrintComponent printComponent, String header) {
        super(printComponent);
        this.header = header;
    }

    @Override
    public void print() {
        // 嵌套执行
        printComponent.print();

        Printer.printHeader(header);
    }
}
