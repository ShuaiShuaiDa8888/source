package com.weishuai.demo;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ReentrantLock 重入锁
 * 启动两个线程，调用两个方法。当方法1结束之后再运行方法2
 * Created by WS on 2019/3/30.
 */
public class Test_01 {
    Lock lock = new ReentrantLock();

    public void m1() {
        lock.lock();
        for (int i = 0; i < 10; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(" m1 method() " + i);
        }
        lock.unlock();
    }

    void m2() {
        lock.lock();
        System.out.println("m2 method() ");
    }

    public static void main(String[] args) {
        final Test_01 t = new Test_01();

        new Thread(new Runnable() {
            @Override
            public void run() {
                t.m1();
            }
        }).start();
        //此处加上sleep()是因为程序启动时两个线程呢个会抢占资源
        //并不知道哪个线程会先运行,加上后就会保证上面的线程先执行
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                t.m2();
            }
        }).start();
    }

}
