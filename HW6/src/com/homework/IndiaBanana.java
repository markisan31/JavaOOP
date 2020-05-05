package com.homework;

public class IndiaBanana extends Banana {
    private Integer curvature; // 0 - 45 degrees

    public IndiaBanana(Double weight, Integer degreeOfMaturity, String bananaSort, Double baseValue, Integer curvature) {
        super(weight, degreeOfMaturity, bananaSort, baseValue);
        this.curvature = curvature;
    }

    @Override
    public Double shelfLife() {
        return (double) (10 - getDegreeOfMaturity()) / 2;
    }

    @Override
    public String toString() {
        return "IndiaBananas{" +
                "curvature=" + curvature + "°, " +
                  super.toString() + "}";
    }
}
