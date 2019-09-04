package com.company.thread_doc;

public class Resource {
    private String name;
    private String sex;
    private boolean flag = false;

    public synchronized void setAttribute(String name,String sex) {
        if(flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.name = name;
        this.sex = sex;

        flag = true;

        this.notify();

    }

    public synchronized void out(){
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(String.format("姓名：%s,性别：%s",name,sex));

        flag=false;
        this.notify();

    }

}
