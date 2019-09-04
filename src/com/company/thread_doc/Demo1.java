package com.company.thread_doc;

public class Demo1 {
    public static void main(String[] args) {
        MyThread th = new MyThread("我的线程");
        th.start();
        System.out.println(th.currentThread().getName());
        for (int i = 0; i <100 ; i++) {
            System.out.println("main主线程正在执行中"+i);
        }
    }
}
