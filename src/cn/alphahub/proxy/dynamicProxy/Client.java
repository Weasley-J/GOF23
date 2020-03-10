package cn.alphahub.proxy.dynamicProxy;

import cn.alphahub.proxy.staticProxy.Star;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        RealStar star = new RealStar();
        StarHandler handler = new StarHandler(star);

        Star proxyStar = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, handler);
        proxyStar.sing();
    }
}
