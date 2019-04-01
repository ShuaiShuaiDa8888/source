package com.weishuai.demo;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 可打断的
 * Created by WS on 2019/3/30.
 */
public class Test_03 {
    Lock lock = new ReentrantLock();

    void m1() {
        try {
            lock.lock();
            for (int i = 0; i < 5; i++) {
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
        try {
            lock.lockInterruptibly();
            System.out.println(" m2() method");
        } catch (InterruptedException e) {
            System.out.println(" m2() method interrupted");
        } finally {
            try {
                lock.unlock();
            } catch (Exception e) {

            }
        }
    }

    public static void main(String[] args) {
        Test_03 t = new Test_03();
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
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                t.m2();
            }
        });
        t2.start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.interrupt();
    }
}
