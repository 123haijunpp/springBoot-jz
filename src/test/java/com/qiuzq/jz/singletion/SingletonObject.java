package com.qiuzq.jz.singletion;

/**
 * program: jz
 * Date: 2018/11/25/025 15:11
 *
 * @author: Mr.Qiu
 * Description: 创建Singleton类
 */
public class SingletonObject {

    //创建 SingleObject 的一个对象
    private static SingletonObject instance = new SingletonObject();

    // 让构造函数为private，这样类就不会被实例化
    private SingletonObject() {
    }

    // 获取唯一可用的对象
    public static SingletonObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }

}
