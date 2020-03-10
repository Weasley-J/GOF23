package cn.alphahub.factory.abstractfactory;

public interface Seat {
    void message();
}

class LuxurySeat implements Seat {

    @Override
    public void message() {
        System.out.println("有按摩功能...");
    }
}

class LowSeat implements Seat {

    @Override
    public void message() {
        System.out.println("没有按摩功能...");
    }
}