package com.homework;



import java.util.Random;
import java.util.Scanner;

public class Main {
    private static int dollarsSpent = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = new Random().nextInt(100000);
        System.out.println("Want to win a million dollars?\nIf so, guess the winning number (a number between 0 and 100000).");
        guessProcess(scanner, randomNumber);


    }

    private static void guessProcess(Scanner scanner, int randomNumber){
        System.out.println("Insert $1.00 and enter your number or 'q' to quit: ");
        String userAnswerForGuess = scanner.nextLine();
        int userNumericAnswerForGuess = -1;
        if (isDigit(userAnswerForGuess)){
            userNumericAnswerForGuess = Integer.parseInt(userAnswerForGuess);
        }
        if (userAnswerForGuess.equals("q")){
            System.out.println(String.format("You lost $%d.00. Thanks for playing. Come again!",dollarsSpent));
            System.exit(0);
        } else if (userNumericAnswerForGuess != -1){
            if (userNumericAnswerForGuess > -1 && userNumericAnswerForGuess < 100000) {
                if (Integer.parseInt(userAnswerForGuess) == randomNumber) {
                    System.out.println("You WIN $1 000 000. That's was awesome!");
                    System.exit(0);
                } else {
                    dollarsSpent++;
                    System.out.println("Sorry, good guess, but not quite right. Do you want me to give you a hint (y|n)?");
                    proposeHint(scanner, userNumericAnswerForGuess, randomNumber);
                }
            } else {
                System.out.println("Sorry, only letter 'q' and numbers in range 0 to 100000 are acceptable");
                guessProcess(scanner, randomNumber);
            }
        } else {
            System.out.println("Sorry, only letter 'q' and numbers in range 0 to 100000 are acceptable");
            guessProcess(scanner, randomNumber);
        }
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    private static void proposeHint(Scanner scanner, int userNumericAnswerForGuess, int randomNumber){
        String userAnswerForHint = scanner.nextLine();
        
        if (userAnswerForHint.equals("y") || userAnswerForHint.equals("n")){
            if (userAnswerForHint.equals("y")){
                System.out.println("Insert $2.00 for the hint!");
                dollarsSpent += 2;
                if (userNumericAnswerForGuess < randomNumber){
                    System.out.println("Your number is too low!");
                    guessProcess(scanner, randomNumber);
                } else {
                    System.out.println("Your number is too high!");
                    guessProcess(scanner, randomNumber);
                }
            } else if (userAnswerForHint.equals("n")) {
                guessProcess(scanner, randomNumber);
            }
        } else {
            System.out.println("Sorry, only letters 'y' and 'n' are acceptable");
            proposeHint(scanner, userNumericAnswerForGuess, randomNumber);
        }
    }



}
