package com.qiuzq.jz.Temp;

/**
 * program: jz
 * Date: 2018/11/22/022 20:06
 *
 * @author: Mr.Qiu
 * Description: 实现类（只实现抽象方法）
 */
public class AnimalImpl implements Animal {
    @Override
    public void printName(String animalName) {
        System.out.println("这是一只：" + animalName);
    }
}
