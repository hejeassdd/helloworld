package com.company.jvm_demo;

public class TestDemo1 {
    public static void main(String[] args) {
        ReferenceCountingGC.testGC();
        System.gc();
    }
}
