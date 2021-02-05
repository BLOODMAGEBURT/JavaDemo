package com.burt.laoma.dynamicbinding;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Child.java
 * @Description TODO
 * @createTime 2020年09月02日 16:21:00
 */
public class Child extends Father {


    @Override
    public void yoga() {
        System.out.println("child do yoga");
    }

    @Override
    public void run() {
        System.out.println("child run too");
    }

    @Override
    public void walk(int i) {
        System.out.println("child walk i:" + i);
    }
}
