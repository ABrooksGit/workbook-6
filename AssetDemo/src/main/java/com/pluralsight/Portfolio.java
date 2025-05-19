package com.pluralsight;

import java.util.ArrayList;

public class Portfolio {

    private String name;
    private String owner;
    private ArrayList<ValueAble> assets;


    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<ValueAble>();
    }


    public void add(ValueAble valueableObject){
        this.assets.add(valueableObject);
    }


    public double getValue(){
        double total = 0;
        for(ValueAble va : assets){

            total += va.getValue();
        }
        return total;
    }
}
