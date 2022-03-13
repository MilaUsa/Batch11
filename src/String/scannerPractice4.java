package String;

import java.util.Scanner;

public class scannerPractice4 {
    public static void main(String[] args) {
        // ask user to enter integer number
        //we will find out if this is even number or not
        // if input 7
        // output 7 is number false
        //input is 8
        //output 8 is even number true
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter an integer number");
        int number=scanner.nextInt();
        // If remainder with 2 gives 0 this number will be even
        // otherwise it is odd
        boolean isEven=number%2==0;
        System.out.println(number +"is even number"+isEven);

        //ask user to enter two integer number
        // first integer you provide should be bigger than
        // second one.
        // if first number bigger than the second one
        // we will print out      true
        //if second number bigger than the first number
        //
        System.out.println("enter your first integer number");
        int firstNumber = scanner.nextInt();
        System.out.println("please enter an integer but smaller than first one");
        int secondNumber= scanner.nextInt();
        boolean isFirstBigger=firstNumber>secondNumber;
        System.out.println(isFirstBigger);

        // to be able to graduate from school
        //student needs
        //%85 attendance
        //80 or higher grade
        //%70 of homework
        //create a program for teacher;
        //teacher will enter all these variables and
        //if student passes you will print true for teacher
        // if student fails you will print false for teacher

        System.out.println("please enter attendance for students");
        int attendance=scanner.nextInt();
        System.out.println("Please enter grade for students");
        int grade=scanner.nextInt();
        System.out.println("please enter homework for students");
        int homework=scanner.nextInt();
        boolean isPass=attendance>=85 && grade>=80 && homework>=70;
        System.out.println(isPass);





    }
}
