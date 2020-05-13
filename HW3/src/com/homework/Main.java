package com.homework;

import java.io.*;
import java.util.Scanner;


public class Main {

    private static final String PATH_TO_FILE = "/Users/markkalda/Desktop/OOP/HW3/src/com/homework/%s.txt"; //change this with Yours path to file

    private static String data[] = new String[5];
    private static int linesCount = 0;
    private static String city;
    private static int showsCount = 0;


    public static void main(String[] args) throws IOException, FileNotFoundException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Hello, enter the file name: ");

        String filePath = String.format(PATH_TO_FILE, reader.readLine());

        readFromFile(filePath);

    }

    public static void countInputFileLines(String path_to_file) throws IOException, FileNotFoundException {
        LineNumberReader reader = new LineNumberReader(new FileReader(path_to_file));

        while ((reader.readLine()) != null) {
            linesCount++;
        }

        reader.close();
    }

    public static void readFromFile(String path_to_file) throws IOException, FileNotFoundException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        countInputFileLines(path_to_file);

        Scanner sc = new Scanner(new FileReader(path_to_file));

        processData(sc.nextLine());

        showData(data, city);

        showsCount++;

        for (int i = showsCount; showsCount < linesCount; i++) {
            System.out.println("There are more data to show. Do You want to see it? y/n");
            if (reader.readLine().equals("y")) {
                processData(sc.nextLine());
                showData(data, city);
                showsCount++;
                if (showsCount == linesCount)
                    System.out.println("There are no more data in this file");
            } else {

                System.out.println("Good bye");
                break;
            }
        }

        sc.close();

    }

    public static void processData(String fullLine) {
        int index_of_first_digit = 0;

        for (char c : fullLine.toCharArray()) {
            if (Character.isDigit(c)) {
                index_of_first_digit = fullLine.indexOf(c);
                break;
            }
        }

        city = fullLine.substring(0, index_of_first_digit - 1);

        data = fullLine.substring(index_of_first_digit).split(" ");
    }


    public static int coldestTemp(String[] data) {
        int minimum = Integer.parseInt(data[0]);

        for (int i = 0; i < data.length; i++) {
            if (minimum > Integer.parseInt(data[i])) {
                minimum = Integer.parseInt(data[i]);
            }
        }

        return minimum;
    }

    public static int warmestTemp(String[] data) {
        int maximum = Integer.parseInt(data[0]);

        for (int i = 0; i < data.length; i++) {
            if (maximum < Integer.parseInt(data[i])) {
                maximum = Integer.parseInt(data[i]);
            }
        }

        return maximum;
    }

    public static double averageTemp(String[] data) {
        double sumOfTemps = 0;


        for (int i = 0; i < data.length; i++) {
            sumOfTemps += Double.parseDouble(data[i]);

        }

        double result = sumOfTemps / data.length;

        return result;
    }


    public static double averageTempWithoutExtremes(String[] data) {
        double sumOfTemps = 0;

        for (int i = 0; i < data.length; i++) {
            if (Double.parseDouble(data[i]) == warmestTemp(data) || Double.parseDouble(data[i]) == coldestTemp(data)) {
                continue;
            } else {
                sumOfTemps += Double.parseDouble(data[i]);
            }
        }

        double result = sumOfTemps / (data.length - 2);

        return result;
    }

    public static void showData(String[] data, String city) {
        System.out.println(String.format("Coldest temperature for %s was %d", city, coldestTemp(data)));
        System.out.println(String.format("Warmest temperature for %s was %d", city, warmestTemp(data)));
        System.out.println(String.format("Average temperature for %s was %.1f", city, averageTemp(data)));
        System.out.println(String.format("Average temperature without extremes for %s was %.1f", city, averageTempWithoutExtremes(data)));
    }
}
