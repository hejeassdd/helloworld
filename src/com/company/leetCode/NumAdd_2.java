package com.company.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 2.两数相加
 *
 * 题目描述:
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 */
public class NumAdd_2 {

    public static void main(String[] args) throws Exception {
        List<Integer> a = Arrays.asList(new Integer[]{4,6});
        List<Integer> b = Arrays.asList(new Integer[]{7,6,9});
        List list = addNumb(a, b);
        System.out.println(list.toString());

    }

    public static List<Integer> addNumb(List<Integer> a, List<Integer> b) throws Exception {

        if(a==null || b==null || a.size()==0 || b.size()==0){
            throw new IllegalArgumentException("传入参数有误！");
        }
        List<Integer> c = new ArrayList<>();
//        判断两个集合的长度，三种情况做不同处理
        if(a.size()<=b.size()){//最后一位有可能进位，需要判断temp,如果等于1，则进位，这是index已经等于集合长度
//            是否需要进位，0不需要，1需要
            int temp=0;
            for (int i=0;i<=b.size();i++){
//                小的集合不能越界
                if(i<a.size()){
                    c.add((a.get(i)+b.get(i)+temp)%10);
                    temp=(a.get(i)+b.get(i)+temp)/10;

                }else{
                    if(i==b.size() && temp==1){
                        c.add(temp);
                    }else{
                        c.add((b.get(i)+temp)%10);
                        temp=(b.get(i)+temp)/10;
                    }
                }
            }
        }else{
            int temp=0;
            for (int i=0;i<=a.size();i++){
//                小的集合不能越界
                if(i<b.size()){
                    c.add((a.get(i)+b.get(i)+temp)%10);
                    temp=(a.get(i)+b.get(i)+temp)/10;

                }else{
                    if(i==a.size() && temp==1){
                        c.add(temp);
                    }else{
                        c.add((a.get(i)+temp)%10);
                        temp=(a.get(i)+temp)/10;
                    }
                }
            }
        }

        return c;
    }



}
