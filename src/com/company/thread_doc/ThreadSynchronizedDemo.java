package com.company.thread_doc;

public class ThreadSynchronizedDemo {
    public static void main(String[] args) {

        ThreadTask task = new ThreadTask();

        new Thread(task).start();
        new Thread(task).start();



    }
}
