package IfPracticeClass;

import java.util.Scanner;

public class ifPractice2 {
    public static void main(String[] args) {
        // get a number between 1 to 7 from user
        // print yhe name of the day for that given number from user
        // 1-- monday
        //2----tuesday
        // 3....
        Scanner number = new Scanner(System.in);
        System.out.println("Please enter a number between 1 to 7 ");
        int number1 = number.nextInt();
        if (number1 == 1) {
            System.out.println("Monday");
            if (number1 == 2) {
                System.out.println("Tuesday");
                if (number1 == 3) {
                    System.out.println("Wednesday");
                    if (number1 == 4) {
                        System.out.println("thursday");
                        if (number1 == 5) {
                            System.out.println("Friday");
                            if (number1 == 6) {
                                System.out.println("Saturday");
                                if (number1 == 7) {
                                    System.out.println("Sanday");
                                }
                            }
                        }
                    }
                }
            }
            // if user enters out of range number
            // print your number is out of range

            if (number1 > 7 || number1 < 1) {
                System.out.println("your number is out of range");
            }


        }
    } }
