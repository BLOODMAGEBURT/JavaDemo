package com.burt.pattern.strategy;

/**
 * CatComparator
 *
 * @author xujianbo
 * @date 2021/3/10 11:27 下午
 * @since 1.0.0
 */
public class CatComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {

        if (o1.weight > o2.weight) {
            return 1;
        } else if (o1.weight < o2.weight) {
            return -1;
        }

        return 0;
    }
}
