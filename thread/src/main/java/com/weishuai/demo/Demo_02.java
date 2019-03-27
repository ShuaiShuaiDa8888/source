package com.weishuai.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * CountDownLatch
 * Created by WS on 2019/3/26.
 */
public class Demo_02 {
    public static void main(String[] args) {
        Demo_02_Container d = new Demo_02_Container();
        CountDownLatch latch = new CountDownLatch(1);

        new Thread(new Runnable() {
            @Override
            public void run() {
                if (d.size() != 5){
                    try {
                        latch.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("size == 5");
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("the container add " + i);
                    d.add(new Object());
                    if (d.size() == 5) {
                        latch.countDown();
                    }
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}

class Demo_02_Container{
    List<Object> container = new ArrayList<>();
    public void add(Object o){
        this.container.add(new Object());
    }
    public int size(){
        return this.container.size();
    }
}
