package com.company.thread_doc;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadTask implements Runnable {
    int x = new Random().nextInt();

    @Override
    public void run() {
        while (true){
            System.out.println("true——x："+x);

            if(x%2==0){
//                情况一
                System.out.println("if线程执行中："+Thread.currentThread().getName());
                synchronized (MyLock.lockA){
                    System.out.println("if线程执行中："+Thread.currentThread().getName());
                    System.out.println("if_x："+x);
                    System.out.println("if-LockA");
                    synchronized (MyLock.lockB){
                        System.out.println("if线程执行中："+Thread.currentThread().getName());
                        System.out.println("if-LockB");
                        System.out.println("if-大口吃肉");
                    }
                }
            }else{
//                情况二
                System.out.println("else线程执行中："+Thread.currentThread().getName());
                synchronized (MyLock.lockB){
                    System.out.println("else线程执行中："+Thread.currentThread().getName());
                    System.out.println("else_x："+x);
                    System.out.println("else-LockB");
                    synchronized (MyLock.lockA){
                        System.out.println("else线程执行中："+Thread.currentThread().getName());
                        System.out.println("else-LockA");
                        System.out.println("else-大口吃肉");
                    }
                }
            }
            x++;
        }
    }
}
