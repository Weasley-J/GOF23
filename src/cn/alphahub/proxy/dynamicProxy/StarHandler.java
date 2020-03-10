package cn.alphahub.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler {
    private RealStar realStar;

    public StarHandler(RealStar realStar) {
        super();
        this.realStar = realStar;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj = null;
        System.out.println("真正的方法执行钱前!");
        System.out.println("面谈,签合同,预付款,订机票");
        if ("sing".equals(method.getName())) {
            obj = method.invoke(realStar, args);
        }
        System.out.println("真正的方法执行后");
        System.out.println("收尾款");
        return obj;
    }
}
