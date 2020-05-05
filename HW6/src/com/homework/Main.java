package com.homework;


import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        IndiaBanana ib1 = new IndiaBanana(0.31, 3, "India Banana", 0.46, 17);
        IndiaBanana ib2 = new IndiaBanana(0.13, 7, "India banana", 0.12, 10);
        SimpleBanana b1 = new SimpleBanana(0.15, 1, "Cavendish banaan", 0.30);
        IndiaBanana ib3 = new IndiaBanana(0.45, 1, "India Banana", 0.98, 45);
        IndiaBanana ib4 = new IndiaBanana(0.27, 9, "India Banana", 0.09, 30);
        IndiaBanana ib5 = new IndiaBanana(0.18, 10, "India Banana", 0.07, 37);
        IndiaBanana ib6 = new IndiaBanana(0.69, 8, "India Banana", 0.15, 8);
        IndiaBanana ib7 = new IndiaBanana(0.19, 4, "India Banana", 0.40, 26);
        SimpleBanana b2 = new SimpleBanana(0.56, 3, "Cavendish banaan", 0.89);
        SimpleBanana b3 = new SimpleBanana(0.89, 6, "Cavendish banaan", 0.33);

        List<Banana> bananas = Arrays.asList(ib1, ib2, ib3, ib4, ib5, ib6, ib7, b1, b2, b3);

        for (Banana b : bananas){
            System.out.println(b);
        }
    }
}
