package com.qiuzq.jz.service.impl;

import java.io.FileInputStream;

public class Test2 {

    public static void main(String[] args) {
        Test2 m = new Test2();
        System.out.println(m.amethod());
    }

    public int amethod() {
        try {
            new FileInputStream("Hello.txt");
        } catch (Exception e) {
            System.out.println("catch block");
            return amethod2();
        } finally {
            System.out.println("finally block");
        }
        return -1;

    }

    public static int amethod2() {
        System.out.println("return method");
        return -1;
    }

}
//public static void main(String argv[J)X
//        Test2 m=new Test2();
//        System.out.printlnm.amet1)

//        try(
//        new FileInputStream("Hello.txt");]catch(Exception ex)[
//        System.out.println("catch block")return amethod2();)finallyf
//        System.out.println("finally block");]
//        return o;
//public static int amethod2()[
//        System.out.prnln("return method");
//        return-1;
