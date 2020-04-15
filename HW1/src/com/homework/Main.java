package com.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        first_task();
        System.out.println();
	    second_task();
        System.out.println();
        third_task();
    }

    public static void first_task() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter circle radius: ");

        int radius = Integer.parseInt(reader.readLine());

        if (radius < 1){
            System.out.println("Can't handle numbers less than 1");
        } else {

            double circle_area = Math.pow(radius, 2) * Math.PI;

            double circle_perimeter = 2 * Math.PI * radius;

            double square_perimeter = 2 * radius * 4;

            double square_area = Math.pow(radius * 2, 2);

            System.out.println(String.format("Circle area: %.2f, Circle perimeter: %.2f", circle_area, circle_perimeter));
            System.out.println(String.format("Square area: %.2f, Square perimeter: %.2f", square_area, square_perimeter));
        }

        reader.close();
    }

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

        for (int a = 0; a < salaries.length; a++) {
            if (salaries[a] < 500) {
                salaries[a] = salaries[a] * 1.05;
                System.out.println(String.format("Salary of %d person after changes is: %.0f", a + 1, salaries[a]));
            } else {
                System.out.println(String.format("Salary of %d person didn't changed", a + 1));
            }

        }

        reader.close();


    }

    public static void third_task() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Sisesta temperatuur: ");

        int temp = Integer.parseInt(reader.readLine());

        if (temp > 25)
            System.out.println("hot!");
        else if (temp > 10 && temp <= 25) {
            System.out.println("warm!");
        } else {
            System.out.println("cold!");
        }

        reader.close();

    }
}
