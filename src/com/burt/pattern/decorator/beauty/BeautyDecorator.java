package com.burt.pattern.decorator.beauty;

/**
 * BeautyDecorator
 *
 * @author xujianbo
 * @date 2021/3/11 12:15 下午
 * @since 1.0.0
 */
public class BeautyDecorator implements IBeauty {

    public IBeauty iBeauty;

    public BeautyDecorator(IBeauty iBeauty) {
        this.iBeauty = iBeauty;
    }

    @Override
    public void makeUp() {
        iBeauty.makeUp();
    }
}
