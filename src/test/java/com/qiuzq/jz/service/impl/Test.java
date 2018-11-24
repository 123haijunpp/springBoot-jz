package com.qiuzq.jz.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * program: jz
 * Date: 2018/11/22/022 19:45
 *
 * @author: Mr.Qiu
 * Description:
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("------ jdk1.8版本新特性lambda，list遍历-----");
        List<String> arr = new ArrayList<String>();
        arr.add("1");
        arr.add("2");
        arr.add("3");
        arr.add("4");
        System.out.println("新特性:使用入表达式遍历集合");
        arr.forEach(s -> System.out.println(s));
//        arr.forEach(System.out::println);
    }

    @org.junit.Test
    public void setUp() {
        changeStr("Hello", (str) -> System.out.println(str));
    }

    /**
     * 消费型接口,有参无返回值
     *
     * @param str
     * @param con
     */
    public void changeStr(String str, Consumer<String> con) {
        con.accept(str);
    }
}
