package com.company;

import java.io.UnsupportedEncodingException;
import java.sql.DriverManager;

public class Main {

    public static void main(String[] args) throws UnsupportedEncodingException {
	// write your code here
//        System.out.println("args = [" + "helloworld" + "]");
        String str = "abc你";
        char[] chars = str.toCharArray();
        byte[] bytes = str.getBytes("UTF-8");
//        System.out.println(chars);
        System.out.println(bytes.toString());
        for (int i=0;i<bytes.length;i++) {
            System.out.println(bytes[i]);
        }


    }
}
