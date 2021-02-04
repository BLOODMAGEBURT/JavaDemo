package com.burt.pattern.decorator;

public class HeaderDecorator extends PrintDecorator {

    private String header;

    public HeaderDecorator(PrintComponent printComponent, String header) {
        super(printComponent);
        this.header = header;
    }

    @Override
    public void print() {
        Printer.printHeader(header);

        // 嵌套执行 todo
        printComponent.print();
    }
}
