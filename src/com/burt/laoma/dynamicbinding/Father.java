package com.burt.laoma.dynamicbinding;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Father.java
 * @Description TODO
 * @createTime 2020年09月02日 16:20:00
 */
public class Father {


    public Father() {

        yoga();
    }

    public static void sleep() {
        System.out.println("father sleep");
    }

    public void yoga() {
        System.out.println("father do yoga");

        run();
    }

    public void run() {
        System.out.println(
                "father run"
        );
    }

    public void walk() {
        walk(10);
    }

    public void walk(int i) {
        System.out.println("father walk 10m");
    }

}
