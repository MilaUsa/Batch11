package loops.While_DoWhile;

import java.util.Scanner;

public class Loopstask3 {
    public static void main(String[] args) {
        //ask user to provide whole int number
        //create multiplication table from 1 to 10 fro the given number
        //
        //input 4---> 4*1=4
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide whole int number");
        int number = sc.nextInt();
        int mul=1;
        //mul++;
        while(mul<=10){

            System.out.println(number+"*"+mul+"="+number*mul);
            mul++;
        }

    }
}
