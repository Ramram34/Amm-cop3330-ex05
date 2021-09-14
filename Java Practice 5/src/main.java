/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Rami Amm
 */


import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("Let's do some math! Pick a number:");
        String firstNumber = x.nextLine();

        Scanner y = new Scanner(System.in);
        System.out.println("Now, pick another number:");
        String secondNumber = y.nextLine();

        int fn = Integer.parseInt(firstNumber);
        int sn = Integer.parseInt(secondNumber);

        int sum = fn + sn;
        int difference = fn - sn;
        int product = fn * sn;
        int quotient = fn / sn;

        System.out.println(firstNumber + "+" + secondNumber + " = " + sum + "\r\n" +
                              firstNumber + "-" + secondNumber + " = " + difference + "\r\n" +
                                 firstNumber + "*" + secondNumber + " = " + product + "\r\n" +
                                     firstNumber + "/" + secondNumber + " = " + quotient);
    }
}
