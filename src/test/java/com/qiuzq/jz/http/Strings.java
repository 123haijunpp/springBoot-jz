package com.qiuzq.jz.http;

/**
 * program: jz
 * Date: 2018/11/29/029 17:44
 *
 * @author: Mr.Qiu
 * Description: String类的常用方法
 */
public class Strings {

    public static void main(java.lang.String[] args) {
        java.lang.String str = "Hello Word";
        String str2 = "Hello word";
//        System.out.println("字符串长度：" + str.length());
//        System.out.println("截取一个字符串(下标):" + str.charAt(1));
//        char[] b = new char[10];
//        str.getChars(1, 5, b, 3);
//        System.out.println(b);
//        byte[] b = str.getBytes();
//        System.out.println(new java.lang.String(b));
//        int i = str.compareTo(str2);
//        int i1 = str.compareToIgnoreCase(str2);
//        System.out.println(i + " " + i1);
//        int l = str.indexOf("l");
//        int d = str.lastIndexOf("d");
//        System.out.println(l + " " + d);
        // 大小写转换
        String s1 = str.toUpperCase();
        String s = str.toLowerCase();
        System.out.println(s1 + " " + s);

    }
}
