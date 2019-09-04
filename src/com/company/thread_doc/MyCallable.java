package com.company.thread_doc;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyCallable(String name) {
        this.name = name;
    }


    @Override
    public Object call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println("callable线程--"+i+":"+getName());
        }
        return 3;
    }
}
