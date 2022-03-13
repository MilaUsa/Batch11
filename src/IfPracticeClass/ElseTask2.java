package IfPracticeClass;

import java.util.Scanner;

public class ElseTask2 {
    public static void main(String[] args) {
        //find out if your zipcode is even number or odd number
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your zipcode");
        int zip= sc.nextInt();
        if(zip%2==0){
            System.out.println("Your zipcode is even number");
            System.out.println("Your zipcode is odd number");

        }

    }
}
