package com.homework;

import java.io.*;
import java.util.Scanner;


public class Main {

    private static final String PATH_TO_FILE = "/Users/markkalda/Desktop/OOP/HW3/src/com/homework/%s.txt"; //change this with Yours path to file

    private static String data[] = new String[5];
    private static int lines_count = 0;
    private static String city;
    private static int shows_count = 0;


    public static void main(String[] args) throws IOException, FileNotFoundException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Hello, enter the file name: ");

        String file_path = String.format(PATH_TO_FILE, reader.readLine());

        read_from_file(file_path);

    }

    public static void count_input_file_lines(String path_to_file) throws IOException, FileNotFoundException {
        LineNumberReader reader = new LineNumberReader(new FileReader(path_to_file));

        while ((reader.readLine()) != null) {
            lines_count++;
        }

        reader.close();
    }

    public static void read_from_file(String path_to_file) throws IOException, FileNotFoundException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        count_input_file_lines(path_to_file);

        Scanner sc = new Scanner(new FileReader(path_to_file));

        process_data(sc.nextLine());

        show_data(data, city);

        shows_count++;

        for (int i = shows_count; shows_count < lines_count; i++) {
            System.out.println("There are more data to show. Do You want to see it? y/n");
            if (reader.readLine().equals("y")) {
                process_data(sc.nextLine());
                show_data(data, city);
                shows_count++;
                if (shows_count == lines_count)
                    System.out.println("There are no more data in this file");
            } else {

                System.out.println("Good bye");
                break;
            }
        }

        sc.close();

    }

    public static void process_data(String full_line) {
        int index_of_first_digit = 0;

        for (char c : full_line.toCharArray()) {
            if (Character.isDigit(c)) {
                index_of_first_digit = full_line.indexOf(c);
                break;
            }
        }

        city = full_line.substring(0, index_of_first_digit - 1);

        data = full_line.substring(index_of_first_digit).split(" ");
    }


    public static int coldest_temp(String[] data) {
        int minimum = Integer.parseInt(data[0]);

        for (int i = 0; i < data.length; i++) {
            if (minimum > Integer.parseInt(data[i])) {
                minimum = Integer.parseInt(data[i]);
            }
        }

        return minimum;
    }

    public static int warmest_temp(String[] data) {
        int maximum = Integer.parseInt(data[0]);

        for (int i = 0; i < data.length; i++) {
            if (maximum < Integer.parseInt(data[i])) {
                maximum = Integer.parseInt(data[i]);
            }
        }

        return maximum;
    }

    public static double average_temp(String[] data) {
        double sum_of_temps = 0;


        for (int i = 0; i < data.length; i++) {
            sum_of_temps += Double.parseDouble(data[i]);

        }

        double result = sum_of_temps / data.length;

        return result;
    }


    public static double average_temp_without_extremes(String[] data) {
        double sum_of_temps = 0;

        for (int i = 0; i < data.length; i++) {
            if (Double.parseDouble(data[i]) == warmest_temp(data) || Double.parseDouble(data[i]) == coldest_temp(data)) {
                continue;
            } else {
                sum_of_temps += Double.parseDouble(data[i]);
            }
        }

        double result = sum_of_temps / (data.length - 2);

        return result;
    }

    public static void show_data(String[] data, String city) {
        System.out.println(String.format("Coldest temperature for %s was %d", city, coldest_temp(data)));
        System.out.println(String.format("Warmest temperature for %s was %d", city, warmest_temp(data)));
        System.out.println(String.format("Average temperature for %s was %.1f", city, average_temp(data)));
        System.out.println(String.format("Average temperature without extremes for %s was %.1f", city, average_temp_without_extremes(data)));
    }
}
