package IfPracticeClass;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IfPracticeN2 {
    public static void main(String[] args) {
        //assume that user is using military style time 1-24
        //print out good morning or good afternoon
        // for the hours of morning or afternoon
        //ask user to enter only hour for the time
        // if the hour is less than 12 print good morning
        // if the hour is more than 12 less than 18 print good afternoon
        // if the hour is more than 18 print good evening

        Scanner time= new Scanner(System.in);
        System.out.println("enter only hour for the time");
        int hour=time.nextInt();
        if(hour<12 && hour>=0){
            System.out.println("Good Morning");
            if(hour>=12 && hour <18){
                System.out.println("Good afternoon");
                if(hour>=18 && hour<24){
                    System.out.println("good evening");
                    if(hour<0 && hour>23){
                        System.out.println("Check your time");
                    }}}}

        int num4= 1234;
        //if(num4){
            System.out.println(num4);
            //number is not a condition, that is why it will not compile
        }
                    }








