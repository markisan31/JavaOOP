package com.homework;

public class Banana {
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

    public Double shelfLife(){
        return (double) (10 - getDegreeOfMaturity());
    }

    @Override
    public String toString() {
        return "Banana{" +
                "weight=" + weight +
                ", degreeOfMaturity=" + degreeOfMaturity +
                ", bananaSort='" + bananaSort + '\'' +
                ", baseValue=" + baseValue +
                ", shelfLife=" + shelfLife() +
                ", price=" + calculatePrice() +
                '}';
    }
}
