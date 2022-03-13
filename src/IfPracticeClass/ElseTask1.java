package IfPracticeClass;

import java.util.Scanner;

public class ElseTask1 {
    public static void main(String[] args) {
        //when your order total is more than $1000 you get %20 discount, other wise you get %5 discount
        //calculate and print total discount and payment in each case

        double total=999;

        if(total>=1000){

            System.out.println("you can get discount:" + total*0.20);
            System.out.println("you payment after discount is:"+ (total-(total*0.2)));
        }else{
            System.out.println("your total discount is" + total*0.05);
            System.out.println("your payment after %20 discount is" +(total-(total*0.2)));
        }

    }
}
