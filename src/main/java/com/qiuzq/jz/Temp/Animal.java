package com.qiuzq.jz.Temp;

/**
 * program: jz
 * Date: 2018/11/22/022 19:59
 *
 * @author: Mr.Qiu
 * Description: 接口的默认方法(非抽象方法)
 */
public interface Animal {

    void printName(String animalName);

    default void eat(String animalName) {
        System.out.println(animalName + "准备进食");
    }

    default void run(String animalName) {
        System.out.println(animalName + "跑起来");
    }
}
