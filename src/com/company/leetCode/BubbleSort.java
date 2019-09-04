package com.company.leetCode;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int temp;

        int[] nums = {5,3,2,8,9,6,7};
//      冒泡排序法,内层倒序，小数冒泡往前走，最多需要n-1次就可以确定所有的数字
        for (int i=0;i<nums.length-1;i++){
//      每次前边少比较一个
            for(int j=nums.length-1;j>i;j--){
                if(nums[j]<nums[j-1]){
                    temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }
            }
        }

        System.out.println("冒泡排序法，排序之后的数组："+ Arrays.toString(nums));

    }


}
