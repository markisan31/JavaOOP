package com.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
//        first_task();
        System.out.println();
//	    second_task();
        System.out.println();
        third_task();
    }


    /// First task

    public static void first_task() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter circle radius: ");

        int radius = Integer.parseInt(reader.readLine());

        if (radius < 1){
            System.out.println("Can't handle numbers less than 1");
        } else {

            System.out.println(String.format("Circle area: %.2f, Circle perimeter: %.2f", circle_area(radius), circle_perimeter(radius)));
            System.out.println(String.format("Square area: %.2f, Square perimeter: %.2f", square_area(radius), square_perimeter(radius)));
        }

        reader.close();
    }

    public static double circle_area (int radius){
        return Math.pow(radius, 2) * Math.PI;
    }

    public static double circle_perimeter (int radius){
        return 2 * Math.PI * radius;
    }

    public static double square_perimeter (int radius){
        return 2 * radius * 4;
    }
    public static double square_area (int radius){
        return Math.pow(radius * 2, 2);
    }

    /// Second task


    public static void second_task() throws IOException {
        double[] salaries = new double[5];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < salaries.length; i++) {
            System.out.println(String.format("Enter salary for %d person: ", i + 1));
            salaries[i] = Double.parseDouble(reader.readLine());
        }

/*        for (int i = 0; i < salaries.length; i++){  // loop for randomly initializing salaries
            salaries[i] = Math.random() * 1000;
            System.out.println(String.format("Salary of %d person before changes is: %.0f", i + 1, salaries[i]));
        }*/

        change_salaries(salaries);

        reader.close();


    }

    public static void change_salaries(double [] salaries){
        for (int a = 0; a < salaries.length; a++) {
            if (salaries[a] < 500) {
                salaries[a] = salaries[a] * 1.05;
                System.out.println(String.format("Salary of %d person after changes is: %.0f", a + 1, salaries[a]));
            } else {
                System.out.println(String.format("Salary of %d person didn't changed", a + 1));
            }

        }
    }

    /// Third task

    public static void third_task() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Sisesta temperatuur: ");

        check_temperature(Integer.parseInt(reader.readLine()));

        reader.close();

    }

    public static void check_temperature(int temperature){
        if (temperature > 25)
            System.out.println("hot!");
        else if (temperature > 10 && temperature <= 25) {
            System.out.println("warm!");
        } else {
            System.out.println("cold!");
        }
    }
}
