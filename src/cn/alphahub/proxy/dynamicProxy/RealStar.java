package cn.alphahub.proxy.dynamicProxy;

import cn.alphahub.proxy.staticProxy.Star;

public class RealStar implements Star {
    /**
     * 面谈
     */
    @Override
    public void confer() {
        System.out.println("真实角色面谈");
    }

    /**
     * 签合同
     */
    @Override
    public void signContract() {
        System.out.println("真实角色签合同");
    }

    /**
     * 订票
     */
    @Override
    public void bookTicket() {
        System.out.println("真实角色订票");
    }

    /**
     * 唱歌
     */
    @Override
    public void sing() {
        System.out.println("真实角色唱歌");
    }

    /**
     * 收钱
     */
    @Override
    public void collectMoney() {
        System.out.println("真实角色收钱");
    }
}
