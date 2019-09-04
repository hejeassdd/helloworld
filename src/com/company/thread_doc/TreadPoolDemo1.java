package com.company.thread_doc;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TreadPoolDemo1 {

    public static void main(String[] args) {
//      创建线程池对象
        ExecutorService executorService = Executors.newFixedThreadPool(5);
//      创建Runnable接口实现类
        MyRunnableForPool myRunnableForPool = new MyRunnableForPool();
//      调用线程池，执行程序
        executorService.submit(myRunnableForPool);
        executorService.submit(myRunnableForPool);
        executorService.submit(myRunnableForPool);
//      关闭线程池
        executorService.shutdown();

    }
}
