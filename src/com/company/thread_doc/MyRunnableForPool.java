package com.company.thread_doc;

public class MyRunnableForPool implements Runnable {


    @Override
    public void run() {
        System.out.println("我请了一个游泳教练");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("教练来了："+Thread.currentThread().getName());
        System.out.println("教我游泳，教完了，教练回到了游泳池！");
    }
}
