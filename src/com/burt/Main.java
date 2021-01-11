package com.burt;

import javax.lang.model.element.NestingKind;

public class Main {
    public static  boolean flag = false;

    public static void main(String[] args) {
	// write your code her


    new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("start");
            while (!flag) {

            }
            System.out.println("while end");
        }
    }).start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("flag changing");
            flag = true;
            System.out.println("flag changed");
        }
    }).start();


    }
}
