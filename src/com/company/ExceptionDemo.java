package com.company;

public class ExceptionDemo {

    public static void main(String[] args) {

        int[] arr = new int[3];
        try {
            System.out.println(arr[5]);
        } catch (Exception e) {
            System.out.println("异常发生了，请注意！");
            e.printStackTrace();
        } finally {
            arr = null;
        }
        System.out.println("程序运行结果。");
    }
}
