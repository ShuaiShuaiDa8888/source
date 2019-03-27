package com.weishuai.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * synchronized
 * Created by WS on 2019/3/26.
 */
public class Demo_01 {
    public static void main(String[] args) {
        Demo_01_Container d = new Demo_01_Container();
        Object lock = new Object();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock){
                    if (d.size() != 5) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("size == 5");
                    lock.notifyAll();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock){
                    for (int i = 0; i < 10; i++){
                        System.out.println("the container add " + i);
                        d.add(new Object());
                        if (d.size() == 5) {
                            lock.notifyAll();
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        try {
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }).start();
    }
}

class Demo_01_Container{
    List<Object> container = new ArrayList<>();
    public void add(Object o){
        this.container.add(new Object());
    }

    public int size(){
        return this.container.size();
    }
}