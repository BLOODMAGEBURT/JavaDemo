package com.burt.pattern.decorator;

public class Client {
    public static void main(String[] args) {
        OriginComponent originComponent = new OriginComponent("这是测试正文");

        HeaderDecorator headerDecorator = new HeaderDecorator(originComponent,"头部");

        FooterDecorator footerDecorator = new FooterDecorator(headerDecorator, "页尾内容");


        footerDecorator.print();
    }
}
