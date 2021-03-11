package com.burt.pattern.decorator.beauty;

/**
 * Girl
 *
 * @author xujianbo
 * @date 2021/3/11 12:14 下午
 * @since 1.0.0
 */
public class Girl implements IBeauty {
    @Override
    public void makeUp() {
        System.out.println("素颜女孩，没化妆");
    }
}
