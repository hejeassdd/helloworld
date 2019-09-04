package com.company.design_pattern;

public class Girl {

    private static Girl g = null;

    public Girl() {
    }

    public static Girl getInstance(){
        if(g==null){
            g = new Girl();
        }

        return g;
    }
}
