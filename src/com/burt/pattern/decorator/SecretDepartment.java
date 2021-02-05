package com.burt.pattern.decorator;

public class SecretDepartment {
    // 绝密打印任务
    public void print() {

        OriginComponent originComponent = new OriginComponent("这是测试正文");

        HeaderDecorator headerDecorator = new HeaderDecorator(originComponent, "头部绝密文件");

        FooterDecorator footerDecorator = new FooterDecorator(headerDecorator, "页尾内容");

        PrintServer.executePrintTask(footerDecorator);
    }
}
