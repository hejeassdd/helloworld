package com.company.design_pattern;

public class SingleDemo {
    public static void main(String[] args) {
//        Son son1 = Son.getInstance();
//        Son son2 = Son.getInstance();
//
//        System.out.println(son1);
//        System.out.println(son2);

//        Girl girl1 = Girl.getInstance();
//        Girl girl2 = Girl.getInstance();
//
//        System.out.println(girl1);
//        System.out.println(girl2);

        new Thread(){
            @Override
            public void run(){
                Girl girl3 = Girl.getInstance();
                System.out.println(girl3);
            }
        }.start();

        new Thread(){
            @Override
            public void run(){
                Girl girl3 = Girl.getInstance();
                System.out.println(girl3);
            }
        }.start();
        new Thread(){
            @Override
            public void run(){
                Girl girl3 = Girl.getInstance();
                System.out.println(girl3);
            }
        }.start();
        new Thread(){
            @Override
            public void run(){
                Girl girl3 = Girl.getInstance();
                System.out.println(girl3);
            }
        }.start();
        new Thread(){
            @Override
            public void run(){
                Girl girl3 = Girl.getInstance();
                System.out.println(girl3);
            }
        }.start();

        new Thread(){
            @Override
            public void run(){
                Girl girl5 = Girl.getInstance();
                System.out.println(girl5);
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                Girl girl4 = Girl.getInstance();
                System.out.println(girl4);
            }
        }).start();


    }
}
