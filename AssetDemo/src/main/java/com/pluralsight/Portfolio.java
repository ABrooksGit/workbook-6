package com.pluralsight;

import java.util.ArrayList;

import java.util.Collections;

import java.util.List;

public class Portfolio {

    private String name;
    private String owner;
    private List<Valuable> assets;


    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<Valuable>();
    }


    public void add(Valuable valueAbleObject){
        this.assets.add(valueAbleObject);
    }


    public double getValue(){
        double total = 0;
        for(Valuable va : assets){

            total += va.getValue();
        }
        return total;
    }


    public Valuable getMostValuable(){
//
//        Collections.max(assets);
    return null;

    }


    public Valuable getLeastValuable(){


        return null;

    }
}
