package com.burt.pattern.strategy;

import java.util.Arrays;

/**
 * Strategy
 * 策略模式
 *
 * @author xujianbo
 * @date 2021/3/10 10:41 下午
 * @since 1.0.0
 */
public class Strategy {

    // 通用排序方法

    public void sort(Comparable[] t) {
        Comparable tmp;
        int length = t.length;

        for (int i = length - 1; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                if (t[j].compare(t[j + 1]) > 0) {
                    tmp = t[j];
                    t[j] = t[j + 1];
                    t[j + 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Cat[] cats = {new Cat(10, 10), new Cat(8, 8), new Cat(2, 2)};
        new Strategy().sort(cats);
        System.out.println(Arrays.toString(cats));
    }
}
