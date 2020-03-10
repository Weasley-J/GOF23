package cn.alphahub.adapter;

/**
 * 适配器
 * 继承需要被适配的类实现目标方法
 */
public class AdapterImpl extends Adapter implements Target {
    @Override
    public void handleReq() {
        super.request();
    }
}
