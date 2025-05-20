package com.pluralsight.collection;


import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {
    private List<T> items;
    private int maxSize;


    public FixedList(int maxSize) {
        this.items = new ArrayList<>();
        this.maxSize = maxSize;


    }

    public void add(T item){
        if(this.items.size() < this.maxSize){
            this.items.add(item);
        }
    }

    public List<T> getItems() {
        return items;

    }




    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {

        this.maxSize = maxSize;
    }


    @Override
    public String toString() {
        return "items= " + items +
                "Size= " + maxSize;
    }
}
