package cn.alphahub.bridge;

public class Client {
    public static void main(String[] args) {
        //销售笔记本
        Computer2 c = new Laptop2(new Lenovo());
        c.sale();
        //销售台式机
        Computer2 c2 = new Desktop2(new Shenzhou());
        c2.sale();
    }
}
