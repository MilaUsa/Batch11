package String;

import java.util.Locale;
import java.util.Scanner;

public class StringPracticeY {
    public static void main(String[] args) {
        //we will ask user to their first name
        // we will ask user to their last name
        // we will print firstname in lower case
        //last name in upper case

        //.toLowerCase(); == Makes the all letters lower case
        //toUpperCase():==makes the all letters upper case
        String str="yusuf";
        str.toUpperCase();
        //if we dont reassign the string
        //it will not change its value
        System.out.println(str);
        str=str.toUpperCase();
        System.out.println(str);
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your first name");
        String firstName=scanner.next();
        System.out.println("Enter your last Name");
        String lastName=scanner.next();
        System.out.println(firstName.toLowerCase()+lastName.toUpperCase());

        //when we use nextLine() we can enter multiple words
        //when use next it will not take more

    }
}
