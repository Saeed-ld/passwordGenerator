package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = "abcdefghijklmnopqrstuvwxyz";
        char[] alphabet = value.toCharArray();

        while(true){
            System.out.println(" do you want a new password? ");
            String answer = scanner.next();
            if (answer.equals("yes")){
                String output =
                        alphabet[(int) (26 * (Math.random()))] + (int) (26 * (Math.random())) + String.valueOf(alphabet[(int) (26 * (Math.random()))]).toUpperCase() +
                                String.valueOf(alphabet[(int) (26 * (Math.random()))]).toUpperCase() + (int) (26 * (Math.random())) + (int) (26 * (Math.random())) + alphabet[(int) (26 * (Math.random()))] +
                                alphabet[(int) (26 * (Math.random()))] + String.valueOf(alphabet[(int) (26 * (Math.random()))]).toUpperCase() +
                                alphabet[(int) (26 * (Math.random()))] + (int) (26 * (Math.random())) + alphabet[(int) (26 * (Math.random()))] +
                                String.valueOf(alphabet[(int) (26 * (Math.random()))]).toUpperCase() + alphabet[(int) (26 * (Math.random()))];
                char[] randomizer = output.toCharArray();
                for (int i = 1; i <= 14 ; i++){
                    System.out.print(randomizer[(int) (14 * (Math.random()))]);
                }

            }
            else {
                break;
            }
        }
    }
}
