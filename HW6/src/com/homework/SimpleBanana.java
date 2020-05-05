package com.homework;

public class SimpleBanana extends Banana {


    public SimpleBanana(Double weight, Integer degreeOfMaturity, String bananaSort, Double baseValue) {
        super(weight, degreeOfMaturity, bananaSort, baseValue);
    }

    @Override
    public Double shelfLife() {
        return (double) (10 - getDegreeOfMaturity());
    }

    @Override
    public String toString() {
        return "SimpleBanana{" + super.toString() + "}";
    }
}
