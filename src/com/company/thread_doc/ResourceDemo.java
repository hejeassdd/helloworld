package com.company.thread_doc;

public class ResourceDemo {

    public static void main(String[] args) {
        Resource r = new Resource();

//        同一个对象锁
        Input in = new Input(r);
        Output out = new Output(r);

        new Thread(in).start();
        new Thread(out).start();

    }

}
