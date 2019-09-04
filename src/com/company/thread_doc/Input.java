package com.company.thread_doc;

public class Input implements Runnable {
    private Resource r;

    public Input(Resource r) {
        this.r = r;
    }

    @Override
    public void run() {
        int count = 0;
        while (true){
            if (count==0){
                System.out.println("input数字："+count);
                r.setAttribute("小明","男生");
            }else{
                System.out.println("input数字："+count);
                r.setAttribute("小红","女生");
            }
            count=(count+1)%2;
        }
    }
}
