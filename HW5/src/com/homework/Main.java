package com.homework;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Product iPhone6S = new Product(1, "iPhone 6s", 378, 759.90);
        Product NokiaNGage = new Product(2, "Nokia N-Gage", 7, 399.50);
        Product SamsungS6 = new Product(3, "Samsung S6", 973, 600.00);
        Product HuaweiP40 = new Product(4, "Huawei P40", 666, 599.99);
        Product MyPhone = new Product(5, "MyPhone", 998, 129.50);
        Product HTCOneM8 = new Product(6, "HTC One M8", 137, 500.00);

        Product[] products = {iPhone6S, NokiaNGage, SamsungS6, HTCOneM8, HuaweiP40, MyPhone};

        for (Product e : products) {
            System.out.println(e.toString());
        }

        //User add his own products, just delete comment "/*" "*/" tags
        /*
        Scanner scn = new Scanner(System.in);

        List<Integer> productNumber = new ArrayList<Integer>();
        List<String> productName = new ArrayList<String>();
        List<Integer> unitsInStock = new ArrayList<Integer>();
        List<Double> priceOfUnit = new ArrayList<Double>();
        ArrayList<Product> productsFromUser = new ArrayList<Product>();
        int amountOfUserProducts = 0;

        System.out.println("Hello, if you want to add your own product please set amount of products you want to add: ");
        amountOfUserProducts = scn.nextInt();

        for (int i = 0; i < amountOfUserProducts; i++){
            System.out.println("Insert product number: ");
            productNumber.add(scn.nextInt());
            System.out.println("Insert product name: ");
            productName.add(scn.next());
            System.out.println("Insert how many units are in stock: ");
            unitsInStock.add(scn.nextInt());
            System.out.println("Insert one unit of product price: ");
            priceOfUnit.add(scn.nextDouble());
            productsFromUser.add(new Product(productNumber.get(i), productName.get(i), unitsInStock.get(i), priceOfUnit.get(i)));
        }


        for (int i = 0; i < productsFromUser.size(); i++){
            System.out.println(productsFromUser.get(i).toString()
            );
        }*/

        DisplayType Amoled = new DisplayType(1, "Samsung Note", 378, 759.90, "Amoled");

        Vendor vendor = new Vendor("Valge klaar OU", "Viru tn 4", "Im arvutid", "5555555");

        Amoled.setVendor(vendor);

        System.out.println(Amoled.toString());
    }


}
