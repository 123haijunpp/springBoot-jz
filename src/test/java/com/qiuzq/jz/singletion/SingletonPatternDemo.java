package com.qiuzq.jz.singletion;

import org.junit.Test;

/**
 * program: jz
 * Date: 2018/11/25/025 15:16
 * @author: Mr.Qiu
 * Description:
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {
        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object = new SingleObject();

        // 获取唯一可用的对象
        SingletonObject object = SingletonObject.getInstance();
        // 显示消息
        object.showMessage();
    }

    @Test
    public void singleton() {
        Singleton02 instance = Singleton02.getInstance();
        System.out.println(instance.hashCode());
    }
}
