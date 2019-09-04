package com.company;

import java.io.File;
import java.io.FileInputStream;

public class FileInputStreamDemo {
    public static void main(String[] args) throws Exception {
        File file = new File("D:\\fileTestDemo2.txt");
        FileInputStream finstream = new FileInputStream(file);
        byte[] buf = new byte[1024];
        int len = 0;
        while((len=finstream.read(buf))!=-1){
            System.out.println("输出："+new String(buf,0,len));
        }
    }

}
