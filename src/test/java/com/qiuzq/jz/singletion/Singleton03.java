package com.qiuzq.jz.singletion;

/**
 * program: jz
 * Date: 2018/11/25/025 15:45
 *
 * @author: Mr.Qiu
 * Description: 双检锁/双重校验锁(DCL，即double-checked locking)
 */
public class Singleton03 {
    private volatile static Singleton03 singleton;
    private Singleton03() {
    }
    /*
        DK 版本：JDK1.5 起
        是否 Lazy 初始化：是
        是否多线程安全：是
        实现难度：较复杂
        描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
        getInstance() 的性能对应用程序很关键。
     */
    public static Singleton03 getSingleton() {
        if (singleton == null) {
            synchronized (Singleton03.class) {
                if (singleton == null) {
                    singleton = new Singleton03();
                }
            }
        }
        return singleton;
    }
}
