package cn.alphahub.test;

import cn.alphahub.seingleton.SingletonDemo5;
import org.junit.Test;

public class TestSingleton {
    @Test
    public void testDemo5() {
        System.out.println(SingletonDemo5.INSTANCE == SingletonDemo5.INSTANCE);
    }
}
