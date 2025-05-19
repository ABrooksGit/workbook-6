package com.pluralsight;

public class Square  {

    private double lengthOfSlides;


    public Square() {
        this.lengthOfSlides = 30;
    }

    public Square(double lengthOfSlides) {
        this.lengthOfSlides = lengthOfSlides;
    }


    @Override
    public String toString() {
        return "Square{" +
                "lengthOfSlides=" + lengthOfSlides +
                '}';
    }
}
