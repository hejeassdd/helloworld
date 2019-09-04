package com.company.leetCode;

import java.util.Arrays;

public class SelectIonSort {

    public static void main(String[] args) {

        int[] nums = {5,3,2,8,9,6,7};

        int min;
        int index;
//      选择排序法，每次比较选出最小值，给最前边赋值
        for (int i=0;i<nums.length-1;i++){
            min = nums[i];
            index=i;
            for (int j=i+1;j<nums.length;j++){
                if(min>nums[j]){
                    min=nums[j];
                    index=j;
                }
            }
            nums[index]=nums[i];
            nums[i]=min;
        }

        System.out.println("选择排序后的数组顺序为："+ Arrays.toString(nums));

    }
}
