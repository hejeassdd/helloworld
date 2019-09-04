package com.company;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class TestDemo0313 {
    public static void main(String[] args) {



//        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
//        List<Integer> distinct = numbers.stream().distinct().sorted((a,b) -> b.compareTo(a)).collect(Collectors.toList());
        List<String> str = Arrays.asList("aa", "fb", "cs", "md", "be");
        List<String> collect = str.stream().distinct().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());

        System.out.println(collect);


    }
}
