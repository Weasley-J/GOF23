package cn.alphahub.prototype;

import java.util.Date;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("少丽", new Date());
        System.out.println(sheep);
        Sheep sheep1 = (Sheep) sheep.clone();
        System.out.println(sheep1);
    }
}
