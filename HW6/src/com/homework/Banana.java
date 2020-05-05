package com.homework;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public abstract class Banana {
    private Double weight; //one banana weight in kg
    private Integer degreeOfMaturity; // 0 - 10
    private String bananaSort;
    private Double baseValue;

    public Banana(Double weight, Integer degreeOfMaturity, String bananaSort, Double baseValue) {
        this.weight = weight;
        this.degreeOfMaturity = degreeOfMaturity;
        this.bananaSort = bananaSort;
        this.baseValue = baseValue;
    }

    public Integer getDegreeOfMaturity() {
        return degreeOfMaturity;
    }

    public Double calculatePrice(){
        if (this.weight > 0.2){
            return shelfLife() * this.baseValue * 0.95;
        }
        return shelfLife() * this.baseValue;
    }

    public abstract Double shelfLife();

    @Override
    public String toString() {
        NumberFormat formatter = new DecimalFormat("#0.00");
        return
                "weight=" + weight + "kg" +
                ", degreeOfMaturity=" + degreeOfMaturity + " days" +
                ", bananaSort='" + bananaSort + '\'' +
                ", baseValue=" + baseValue + "€" +
                ", shelfLife=" + shelfLife() + " days" +
                ", price=" + formatter.format(calculatePrice()) + "€"
                ;
    }

}
