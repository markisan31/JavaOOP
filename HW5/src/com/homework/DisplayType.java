package com.homework;

public class DisplayType extends Product {
    private String displayType;

    public DisplayType(Integer productNumber, String productName, Integer unitsInStock, Double priceOfUnit, String displayType) {
        super(productNumber, productName, unitsInStock, priceOfUnit);
        this.displayType = displayType;
    }

    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    @Override
    public double calculateValueOfInventoryItem(){
        return  super.calculateValueOfInventoryItem() + super.calculateValueOfInventoryItem() * 0.05;
    }

    @Override
    public String toString() {
        return "DisplayType{" +
                "displayType='" + displayType + '\'' +
                "} " + super.toString();
    }
}
