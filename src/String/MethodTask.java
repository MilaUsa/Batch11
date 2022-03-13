package String;

import java.util.Scanner;

public class MethodTask {
    public static void main(String[] args) {
        //_Task: get string from user
        // print first, last middle, second matching 'c', length, index of x
        Scanner string= new Scanner(System.in);
        System.out.println("Please give a string value");
        String userS= string.nextLine();
        System.out.println("The first letter is "+userS.charAt(0));
        System.out.println("The last letter is" +userS.charAt(userS.length()-1));
        System.out.println("middle char is " + userS.charAt(userS.length()/2));
        System.out.println("Second matching c's index number is " + userS.indexOf("c",userS.indexOf("c")+1));
        System.out.println("The length of the string is" +userS.length());
        System.out.println("The index of 'x' is " +userS.indexOf("x"));



    }
}
