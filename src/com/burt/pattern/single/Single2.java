package com.burt.pattern.single;

/**
 * Single2
 *
 * @author xujianbo
 * @date 2021/3/10 10:33 下午
 * @since 1.0.0
 */
public enum Single2 {
    INSTANCE;

    public void print() {
        System.out.println("print :");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Single2.INSTANCE.hashCode());
                }
            }).start();

        }
    }
}

