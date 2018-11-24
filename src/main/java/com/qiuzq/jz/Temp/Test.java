package com.qiuzq.jz.Temp;

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
}
