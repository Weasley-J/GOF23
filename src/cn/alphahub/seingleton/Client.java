package cn.alphahub.seingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 测试反射和反序列化破解单例模式
 */
public class Client {
    public static void main(String[] args) throws Exception {

        SingletonDemo6 s1 = SingletonDemo6.getInstance();
        SingletonDemo6 s2 = SingletonDemo6.getInstance();
        System.out.println(s1);
        System.out.println(s2);
        /*
        Class<SingletonDemo6> clazz = (Class<SingletonDemo6>) Class.forName("cn.alphahub.seingleton.SingletonDemo6");
        Constructor<SingletonDemo6> constructor = clazz.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        SingletonDemo6 s3 = constructor.newInstance();
        SingletonDemo6 s4 = constructor.newInstance();
        System.out.println(s3);
        System.out.println(s4);
        */
        //通过反序列化的方式构造多个对象
        FileOutputStream fos = new FileOutputStream("d:/a.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);
        oos.close();
        fos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/a.txt"));
        SingletonDemo6 S3 = (SingletonDemo6) ois.readObject();
        System.out.println(S3);
    }
}
