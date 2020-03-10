package cn.alphahub.proxy.dynamicProxy;

import cn.alphahub.proxy.staticProxy.Star;

public class ProxyStar implements Star {
    private Star star;

    public ProxyStar(Star star) {
        this.star = star;
    }

    /**
     * 面谈
     */
    @Override
    public void confer() {
        System.out.println("代理对象面谈");
    }

    /**
     * 签合同
     */
    @Override
    public void signContract() {
        System.out.println("代理对象签合同");
    }

    /**
     * 订票
     */
    @Override
    public void bookTicket() {
        System.out.println("代理对象订票");
    }

    /**
     * 唱歌
     */
    @Override
    public void sing() {
        star.sing();
    }

    /**
     * 收钱
     */
    @Override
    public void collectMoney() {
        System.out.println("代理对象收钱");
    }
}
