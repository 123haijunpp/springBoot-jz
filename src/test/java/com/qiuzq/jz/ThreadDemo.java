package com.qiuzq.jz;

import org.junit.Test;

/**
 * program: jz
 * Date: 2018/11/26/026 10:12
 *
 * @author: Mr.Qiu
 * Description:
 */
public class ThreadDemo extends Thread {

    private int i;

    // 线程的执行体
    @Override
    public void run() {
        for (; i < 300; i++) {
            System.out.println(getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        // 创建线程对象
        ThreadDemo threadDemo = new ThreadDemo();
        for (int i = 0; i < 300; i++) {
            // 调用Thread的currentThread()方法获取当前线程
            System.out.println(Thread.currentThread().getName() + "" + i);
            if (i == 20) {
                // 启动线程
                threadDemo.start();
                // 判断启动后线程的isAlive()值，输出true, 判断是否存活
                System.out.println(threadDemo.isAlive() + ".......................");
            }
            // 只有当线程处于新建、死亡两种状态时isAlive()方法返回false。
            // 当i > 20，则该线程肯定已经启动过了，如果sd.isAlive()为假时，
            // 那只能是死亡状态了。
            if (i > 20 && !threadDemo.isAlive())

            {
                // 试图再次启动该线程
                threadDemo.start();
            }
        }
    }

    @Test
    public void t() {
        double i = 1000000000.05;
        System.out.println(i + 80.12);
    }
}
