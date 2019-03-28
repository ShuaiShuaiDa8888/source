package com.weishuai.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * volatile
 * 自定义容器，提供新增元素（add）和获取元素数量（size）方法
 * 启动两个线程，线程1向容器中新增10个数据，线程2监听元素容器数量，当元素容器数量为5时线程2输出信息并终止
 * Created by WS on 2019/3/29.
 */
public class Demo_03 {
    public static void main(String[] args) {
        Demo_03_Container d = new Demo_03_Container();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(" Object add " + i);
                    d.add(new Object());
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    if (d.size() == 5) {
                        System.out.println("size == 5");
                        break;
                    }
                }
            }
        }).start();
    }
}

class Demo_03_Container {
    volatile List<Object> container = new ArrayList<>();

    protected void add(Object o) {
        this.container.add(o);
    }

    protected int size() {
        return this.container.size();
    }
}
