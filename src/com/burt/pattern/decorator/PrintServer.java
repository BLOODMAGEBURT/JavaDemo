package com.burt.pattern.decorator;

public class PrintServer {
    public static void main(String[] args) {
        new SecretDepartment().print();


    }

    public static void executePrintTask(PrintComponent printComponent) {
        // 记录日志
        log();

        printComponent.print();

        // 审计
        audit();
    }

    private static void log() {
        System.out.println("log");
    }

    private static void audit() {
        System.out.println("audit");
    }

}
