package com.burt.pattern.single;

/**
 * Single
 *
 * @author xujianbo
 * @date 2021/3/10 10:31 下午
 * @since 1.0.0
 */
public class Single {

    private Single() {

    }

    private static final Single INSTANCE = new Single();

    public static Single getInstance() {

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Single.getInstance().hashCode());
                }
            }).start();
        }
    }

}
