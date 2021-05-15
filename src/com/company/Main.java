package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String value = "abcdefghijklmnopqrstuvwxyz";
        String symbol = "#$%_-&";
        randomizer(value.toCharArray(), symbol.toCharArray());

    }
    public static void randomizer(char[] alphabet,char[] symbolArray){
        Scanner scanner = new Scanner(System.in);
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
