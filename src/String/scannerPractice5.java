package String;

import java.util.Scanner;

public class scannerPractice5 {
    public static void main(String[] args) {



        // if the user enters char that is not an English letter
        //code should print false
        // if user enters English letter code should print true

        char ch='A';

        // if this ch is a letter or not.
        //if the value of the char between char a and char z
        //it means this char is a letter
        boolean isLetter= ch >='a'&& ch<='z';//||ch>='A'&&ch<='Z';
        System.out.println(isLetter);






    }
}
