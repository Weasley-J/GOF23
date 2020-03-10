package cn.alphahub.factory.abstractfactory;

public class Client {
    public static void main(String[] args) {
        //高端汽车
        CarFactory factory = new LuxuryCarFactory();
        Engine engine = factory.createEngine();
        engine.run();
        engine.start();
    }
}
