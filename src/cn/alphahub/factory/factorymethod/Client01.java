package cn.alphahub.factory.factorymethod;

public class Client01 {
    public static void main(String[] args) {
        Car c1 = new AudiFactory().createCar();
        c1.run();
        Car c2 = new BydFactory().createCar();
        c2.run();
    }
}
