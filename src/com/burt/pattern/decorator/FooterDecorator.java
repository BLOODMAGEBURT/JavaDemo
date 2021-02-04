package com.burt.pattern.decorator;

public class FooterDecorator extends PrintDecorator {

    private String footer;

    public FooterDecorator(PrintComponent printComponent, String footer) {
        super(printComponent);
        this.footer = footer;
    }

    @Override
    public void print() {
        Printer.printFooter(footer);

        printComponent.print();
    }
}
