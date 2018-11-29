package com.qiuzq.jz.collections;

import org.junit.Test;

import java.util.*;

/**
 * program: jz
 * Date: 2018/11/27/027 21:48
 *
 * @author: Mr.Qiu
 * Description:
 */
public class List {

    public static void main(String[] args) {
        java.util.List<String> arr = new ArrayList<>();
        arr.add("01");
        arr.add("02");
        arr.add("03");
        arr.add("04");
        arr.add("04");
//        arr.add(1,"插入哦"); // 插入某个位置
//        System.out.println("获取集合最大值：" + Collections.max(arr));
//        System.out.println("获取集合最小值：" + Collections.min(arr));
//        arr.forEach(String -> System.out.println(String));

        // 创建一个不允许重复的Hashset
        Set hashSet = new HashSet(arr);

        ArrayList arr2 = new ArrayList(hashSet);
        // 确保顺序正确，因为HashSet不是
        Collections.sort(arr2);

        arr2.forEach(String -> {
            System.out.println(String);
        });
    }

    @Test
    public void linkedList() {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("1");
        ll.add("2");
        ll.add("3");
        ll.add("4");
        ll.addFirst("追加到头部1");
        ll.addLast("追加到尾部");
        ll.forEach(String -> System.out.println(String));
    }

    @Test
    public void stream() {

    }
}
