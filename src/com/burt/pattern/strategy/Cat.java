package com.burt.pattern.strategy;

/**
 * Cat
 *
 * @author xujianbo
 * @date 2021/3/10 10:43 下午
 * @since 1.0.0
 */
public class Cat implements Comparable<Cat> {
    int weight;
    int height;

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public int compare(Cat that) {
        // 根据weight判断大小
        if (this.weight > that.weight) {
            return 1;
        } else if (this.weight < that.weight) {
            return -1;
        }
        // 相等时return 0
        return 0;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
