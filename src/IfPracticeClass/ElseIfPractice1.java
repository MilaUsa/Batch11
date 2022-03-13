package IfPracticeClass;

import java.util.Scanner;

public class ElseIfPractice1 {
    public static void main(String[] args) {
        // get three test results from user and calculate  the average of those three tests
        // test score should be in range of 0 to 100
        // based on the average score:
        //-print out letter grade for this student
        // average---> 100-90-->your letter grade is A
        //average is --> 89-80 --> your letter grade is B
        // --> 79-60-->......C
        // ---> less than 60--> you should take the course again

        Scanner sc=new Scanner(System.in);
        System.out.println("please enter first test results");
        int test1=sc.nextInt();
        System.out.println("please enter second test results");
        int test2=sc.nextInt();
        System.out.println("please enter third test results");
        int test3=sc.nextInt();
        int average=(test1+test2+test3)/3;

        if(average>=90 && average <=100){
            System.out.println("Your letter greda is A");
        }else if(average>=80 && average <=89){
            System.out.println("your letter grade is B");
        }else if(average>=60 && average <=79){
            System.out.println("Your letter grade is C");

        }else{
            System.out.println("you need to take the course again");
        }

        
    }
}
