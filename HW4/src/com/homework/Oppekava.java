package com.homework;

import java.util.Arrays;

public class Oppekava {
        String oppekavaKood;
        Aine [] ained;


    public Oppekava(String oppekavaKood, Aine[] ained) {
        this.oppekavaKood = oppekavaKood;
        this.ained = ained;
    }

    public Oppekava() {
    }

    public String getOppekavaKood() {
        return oppekavaKood;
    }

    public void setOppekavaKood(String oppekavaKood) {
        this.oppekavaKood = oppekavaKood;
    }

    public Aine[] getAined() {
        return ained;
    }

    public void setAined(Aine[] ained) {
        this.ained = ained;
    }

    @Override
    public String toString() {
        return "Oppekava{" +
                "oppekavaKood='" + oppekavaKood + '\'' +
                ", ained=" + Arrays.toString(ained) +
                '}';
    }
}
