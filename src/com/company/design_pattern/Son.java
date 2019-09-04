package com.company.design_pattern;

public class Son {

    private static Son s = new Son();

    private Son() {
    }

    public static Son getInstance(){
        return s;
    }
}
