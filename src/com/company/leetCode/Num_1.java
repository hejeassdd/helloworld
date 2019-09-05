package com.company.leetCode;

import java.util.Scanner;

/**
 * 1.两数之和
 *
 * 题目描述:
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 */
public class Num_1 {

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
