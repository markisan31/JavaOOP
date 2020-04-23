package com.homework;

public class Product {
        private Integer productNumber;
        private String productName;
        private Integer unitsInStock;
        private Double priceOfUnit;
        private Vendor vendor;

    public Product(Integer productNumber, String productName) {
        this.productNumber = productNumber;
        this.productName = productName;
    }

    public Product(Integer productNumber, String productName, Integer unitsInStock, Double priceOfUnit) {
        this.productNumber = productNumber;
        this.productName = productName;
        this.unitsInStock = unitsInStock;
        this.priceOfUnit = priceOfUnit;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public Integer getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(Integer productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(Integer unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public Double getPriceOfUnit() {
        return priceOfUnit;
    }

    public void setPriceOfUnit(Double priceOfUnit) {
        this.priceOfUnit = priceOfUnit;
    }


    public double calculateValueOfInventoryItem(){
        return  this.unitsInStock * this.priceOfUnit;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productNumber=" + productNumber +
                ", productName='" + productName + '\'' +
                ", unitsInStock=" + unitsInStock +
                ", priceOfUnit=" + priceOfUnit +
                ", vendor=" + vendor +
                ", valueOfItemInInventory=" + calculateValueOfInventoryItem() +
                '}';
    }
}
