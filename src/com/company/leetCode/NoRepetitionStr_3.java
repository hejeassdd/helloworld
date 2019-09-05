package com.company.leetCode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 无重复字符的最长子串
 * 题目描述
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 1:
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 */
public class NoRepetitionStr_3 {

    public static void main(String[] args) {

        int len = getNoRepetitionStr(" ");
        System.out.println(len);

    }


    public static int getNoRepetitionStr(String s){
        if (s==null){
            throw new IllegalArgumentException("传入参数为null");
        }
        if(s.length()==0){
            return 0;
        }else{
            String[] split = s.split("");

            //记录子串的最长长度的集合，取出最大值
            int[] lengthArray = new int[split.length];


            //临时记录字符串，用来判断是否有重复字母的比对子串
            String result = "";
            for (int i=0;i<split.length;i++){
                int maxLen = 1;
                int length = 1;
                result = split[i];
                for (int j=i+1;j<split.length;j++){
                    if(!result.contains(split[j])){
                        length++;
                        result+=split[j];
                        if(length>maxLen){
                            maxLen=length;
                        }
                    }else{
                        if(length>maxLen){
                            maxLen=length;
                        }
                        break;
                    }
                }
                lengthArray[i]=maxLen;

            }
            Arrays.sort(lengthArray);
            return lengthArray[lengthArray.length-1];
        }

    }
}
