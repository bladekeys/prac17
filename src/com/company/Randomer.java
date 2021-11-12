package com.company;

import java.util.ArrayList;

public class Randomer {
    private ArrayList<String> list = new ArrayList<>();

    private final String[] mas = {"RUR","EU","USD","JPY","CNY","CHF","RSD"};

    public void generate(int k){
        for(int i = 0;i < k;i++)
            list.add((Math.random()*101) +" " + mas[(int)(Math.random()*7)]);
    }

    public ArrayList<String> getList() {
        return list;
    }
}