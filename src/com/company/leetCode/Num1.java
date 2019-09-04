package com.company.leetCode;

import java.util.Scanner;

public class Num1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请您输入要求的和数：");

        int[] nums = {2,4,5,8,9};
        //数字值
        int a=0;
        int b=0;
        //数字下标
        int ai=0;
        int bj=0;


        int goal = scanner.nextInt();

        for (int i=0;i<nums.length-1;i++){
            for (int j=i+1;j<nums.length;j++){
                if(goal==nums[i]+nums[j]){
                    a = nums[i];
                    b = nums[j];
                    ai = i;
                    bj = j;
                }
            }
        }
        if(goal==a+b){
            System.out.println(String.format("您输入的和数%s=%s+%s,它们的下标分别是nums[%s],nums[%s]",goal,a,b,ai,bj));
        }else{
            System.out.println("数组中没有满足条件的两个数字");
        }

    }
}
