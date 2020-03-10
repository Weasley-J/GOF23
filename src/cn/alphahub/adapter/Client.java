package cn.alphahub.adapter;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        Target target = new AdapterImpl();
        client.test1(target);
    }

    public void test1(Target t) {
        t.handleReq();
    }

}
