package com.company.thread_doc;

public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i <100 ; i++) {
            System.out.println(getName()+":正在执行中！"+i+this.currentThread().getName());
        }
    }
}
