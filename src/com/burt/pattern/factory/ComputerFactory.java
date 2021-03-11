package com.burt.pattern.factory;

/**
 * ComputerFactory
 *
 * @author xujianbo
 * @date 2021/3/11 11:08 上午
 * @since 1.0.0
 */
public class ComputerFactory {

    private final static ComputerFactory factory = new ComputerFactory();

    private ComputerFactory() {

    }

    public static ComputerFactory getFactory() {
        return factory;
    }

    public Computer produce(ComputerType type) {

        if (type == ComputerType.PC) {
            return new Pc();
        } else if (type == ComputerType.SERVER) {
            return new Server();
        }

        return null;
    }
}
