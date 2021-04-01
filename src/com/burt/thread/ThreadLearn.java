package com.burt.thread;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * ThreadLearn
 *
 * @author xujianbo
 * @date 2021/4/1 9:23 下午
 * @since 1.0.0  线程池学习
 */
public class ThreadLearn {

    public static void test() {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(10, 20,
                0, TimeUnit.SECONDS, new LinkedBlockingDeque<>(30));


        for (int i = 0; i < 25; i++) {
            executor.execute(new MyTask(i));
        }

    }

    public static class MyTask implements Runnable {

        private final int num;

        public MyTask(int num) {

            this.num = num;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("当前线程：" + Thread.currentThread().getName() + "当前任务：" + num);
        }
    }

    public static void main(String[] args) {
        test();
    }

}
