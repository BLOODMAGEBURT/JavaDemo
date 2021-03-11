package com.burt.pattern.decorator.beauty;

/**
 * Client
 *
 * @author xujianbo
 * @date 2021/3/11 12:21 下午
 * @since 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        Girl girl = new Girl();
        girl.makeUp();

        EyeDecorator eyeDecorator = new EyeDecorator(girl);
        eyeDecorator.makeUp();

        FaceDecorator faceDecorator = new FaceDecorator(eyeDecorator);
        faceDecorator.makeUp();
    }
}
