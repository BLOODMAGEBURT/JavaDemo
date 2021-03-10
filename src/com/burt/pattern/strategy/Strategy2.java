package com.burt.pattern.strategy;

import java.util.Arrays;

/**
 * Strategy2
 *
 * @author xujianbo
 * @date 2021/3/10 11:25 下午
 * @since 1.0.0
 */
public class Strategy2<T> {

    public void sort(T[] t, Comparator<T> comparator) {
        T tmp;
        int length = t.length;

        for (int i = length - 1; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                if (comparator.compare(t[j], t[j + 1]) > 0) {
                    tmp = t[j];
                    t[j] = t[j + 1];
                    t[j + 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Cat[] cats = {new Cat(10, 10), new Cat(11, 11), new Cat(2, 2)};
        new Strategy2<Cat>().sort(cats, new CatComparator());
        System.out.println(Arrays.toString(cats));
    }
}
