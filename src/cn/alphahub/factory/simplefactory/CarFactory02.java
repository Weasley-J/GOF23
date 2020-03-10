package cn.alphahub.factory.simplefactory;

/**
 * 简单工厂模式(也叫静态工厂)
 */
public class CarFactory02 {

    public static Car createAodi() {
        return new Aodi();
    }

    public static Car createByd() {
        return new Byd();
    }
}
