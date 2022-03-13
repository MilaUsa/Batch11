package loops.While_DoWhile;

import java.util.Scanner;

public class MakingStarTree {
    public static void main(String[] args) {
        // -Ask user to provide a number between 3 to 10
        //  - make a star tree for that many line
        //  (Use Do-While Loop to implement solution)
        //    ex: input --> 4
        //                  *
        //                  **
        //                  ***
        //                  ****
        Scanner sc= new Scanner(System.in);
        System.out.println("provide a number between 3 to 10");
        int num=sc.nextInt();

        int x=0;
        String str="*";
        if(num>+3 && num <=10) {
            do {
                //str+="*";
                System.out.println(str);
                str += "*";
                x++;

            } while (x < num);
        }
    }
}
