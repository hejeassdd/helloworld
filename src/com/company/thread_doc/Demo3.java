package com.company.thread_doc;

public class Demo3 {

    public static void main(String[] args) throws Exception {
        MyCallable myCallable = new MyCallable("mycallable");
        Object call = myCallable.call();
//        如果是这样就有先后顺序了
        System.out.println("循环完毕返回值："+call);
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"--"+i);
        }
    }
}
