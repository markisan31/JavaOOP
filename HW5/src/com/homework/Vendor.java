package com.homework;

public class Vendor {
    private String companyName;
    private String companyAddress;
    private String representativeName;
    private String phoneNumber;

    public Vendor(String companyName, String companyAddress) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
    }

    public Vendor(String companyName, String companyAddress, String representativeName, String phoneNumber) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.representativeName = representativeName;
        this.phoneNumber = phoneNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getRepresentativeName() {
        return representativeName;
    }

    public void setRepresentativeName(String representativeName) {
        this.representativeName = representativeName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Vendor{" +
                "companyName='" + companyName + '\'' +
                ", companyAddress='" + companyAddress + '\'' +
                ", representativeName='" + representativeName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

}
