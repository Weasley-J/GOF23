package cn.alphahub.seingleton;

/**
 * 测试枚举实现单例模式(没有延时加载)
 */
public enum SingletonDemo5 {
    //这个枚举元素本身就是单列
    INSTANCE;

    //添加自己需要的操作
    public void SingletonOpration() {
    }
}
