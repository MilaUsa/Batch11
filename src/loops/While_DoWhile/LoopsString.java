package loops.While_DoWhile;

import java.util.Scanner;

public class LoopsString {
    public static void main(String[] args) {
        //get a string from user and print out every letter from given string seperated by comma
        //
        //input---> winter
        //out----> w, i, n, t, e, r,
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter string");
        String str=sc.nextLine();
       int  i=0;
        while(i<str.length()) {
            System.out.print(str.charAt(i) + ",");
            i++;
        }
        System.out.println();
            //print those letters from ent to beginning
            int lIndex=str.length()-1;
            while(lIndex>=0){
                System.out.print(str.charAt(lIndex)+ ",");
                lIndex--;
            }
        }
    }

