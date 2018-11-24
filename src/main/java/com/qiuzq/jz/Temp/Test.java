package com.qiuzq.jz.Temp;

import java.util.HashMap;
import java.util.UUID;

/**
 * program: jz
 * Date: 2018/11/22/022 20:11
 *
 * @author: Mr.Qiu
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        AnimalImpl animal = new AnimalImpl();
        animal.printName("小猫");
        System.out.println("========上面为继承方法，下面为jdk1.8中新特性，非抽象方法======");
        animal.eat("猪");
        animal.run("狗");
    }

    @org.junit.Test
    public void currentHashMap() throws InterruptedException {
        final HashMap<String, String> map = new HashMap<>(2);
        Thread t = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                new Thread(() -> map.put(UUID.randomUUID().toString(), ""), "ftf" + i).start();
            }
        }, "ftf");
        t.start();
        t.join();
        // 为什么代码没有同步
    }
}
