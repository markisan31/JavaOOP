package com.homework;

public class Aine {

    private String aineKood;
    private String aineNimetus;
    private int aineEAP;

    public Aine(String aineKood, String aineNimetus, int aineEAP) {
        this.aineKood = aineKood;
        this.aineNimetus = aineNimetus;
        this.aineEAP = aineEAP;
    }

    public Aine() {
    }

    public String getAineKood() {
        return aineKood;
    }

    public void setAineKood(String aineKood) {
        this.aineKood = aineKood;
    }

    public String getAineNimetus() {
        return aineNimetus;
    }

    public void setAineNimetus(String aineNimetus) {
        this.aineNimetus = aineNimetus;
    }

    public int getAineEAP() {
        return aineEAP;
    }

    public void setAineEAP(int aineEAP) {
        this.aineEAP = aineEAP;
    }

    @Override
    public String toString() {
        return "Aine{" +
                "aineKood='" + aineKood + '\'' +
                ", aineNimetus='" + aineNimetus + '\'' +
                ", aineEAP=" + aineEAP +
                '}';
    }

    public int hoursToSuccess(){
        return 8 * aineEAP;
    }
}
