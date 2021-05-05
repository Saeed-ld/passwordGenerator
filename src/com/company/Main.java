package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = "abcdefghijklmnopqrstuvwxyz";
        char[] alphabet = value.toCharArray();
        String symbol = "#$%_-&";
        char[] symbolArray = symbol.toCharArray();

        while(true){
            System.out.println(" do you want a new password? ");
            String answer = scanner.next();
            if (answer.equals("yes")){
                String output =
                                alphabet[(int) (25 * (Math.random()))]       //letter
                                + symbolArray[(int) (5 * (Math.random()))]  //symbol
                                + String.valueOf(alphabet[(int) (25 * (Math.random()))]).toUpperCase()      //uppercase letter
                                + String.valueOf(alphabet[(int) (25 * (Math.random()))]).toUpperCase()      //uppercase letter
                                + (int) (25 * (Math.random()))              //number
                                + (int) (25 * (Math.random()))              //number
                                + alphabet[(int) (25 * (Math.random()))]    //letter
                                + symbolArray[(int) (5 * (Math.random()))]  //symbol
                                + symbolArray[(int) (5 * (Math.random()))]  //symbol
                                + alphabet[(int) (25 * (Math.random()))]    //letter
                                + (int) (25 * (Math.random()))              //number
                                + symbolArray[(int) (5 * (Math.random()))]  //symbol
                                + String.valueOf(alphabet[(int) (25 * (Math.random()))]).toUpperCase()      //uppercase letter
                                + alphabet[(int) (25 * (Math.random()))];   //letter

                char[] randomizer = output.toCharArray();

                for (int i = 1; i <= 14 ; i++){
                    System.out.print(randomizer[(int) (13 * (Math.random()))]);
                }

            }
            else {
                break;
            }
        }
    }
}
