package com.company.thread_doc;

public class Demo2 {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable("我的第A个线程");
//
//        Thread t1 = new Thread(mr)
//        t1.start();
        new Thread(mr).start();
        new Thread(new MyRunnable("我的第B个线程")).start();
        for (int i = 0; i <100 ; i++) {
            System.out.println("main主线程正在执行中"+i);
        }
    }
}
