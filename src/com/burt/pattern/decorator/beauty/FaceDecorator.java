package com.burt.pattern.decorator.beauty;

/**
 * FaceDecorator
 *
 * @author xujianbo
 * @date 2021/3/11 12:21 下午
 * @since 1.0.0
 */
public class FaceDecorator extends BeautyDecorator {
    public FaceDecorator(IBeauty iBeauty) {
        super(iBeauty);
    }

    @Override
    public void makeUp() {
        super.makeUp();
        System.out.println("加了 廋脸 特效");
    }
}
