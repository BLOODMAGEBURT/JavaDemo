package com.burt.pattern.decorator.beauty;

/**
 * EyeDecorator
 *
 * @author xujianbo
 * @date 2021/3/11 12:18 下午
 * @since 1.0.0
 */
public class EyeDecorator extends BeautyDecorator {

    public EyeDecorator(IBeauty iBeauty) {
        super(iBeauty);
    }

    @Override
    public void makeUp() {
        super.makeUp();
        System.out.println("加了 大眼 特效");
    }
}
