package com.weishuai.demo;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ReentrantLock 尝试锁
 * 启动两个线程，执行两个方法。
 * 线程1先执行，线程2五秒内尝试获取锁标记
 * Created by WS on 2019/3/30.
 */
public class Test_02 {
    Lock lock = new ReentrantLock();

    void m1() {
        try {
            lock.lock();
            for (int i = 0; i < 10; i++) {
                System.out.println(" m1() method " + i);
                TimeUnit.SECONDS.sleep(1);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    void m2() {
        boolean flag = false;
        try {
            flag = lock.tryLock(5, TimeUnit.SECONDS);
            if (flag) {
                System.out.println("m2() method get synchronized");
            } else {
                System.out.println(" m2() method don't get synchronized");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (flag) {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        Test_02 t = new Test_02();
        new Thread(new Runnable() {
            @Override
            public void run() {
                t.m1();
            }
        }).start();
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
