package array;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*-ask user, how many names that s/he wants to store in array
-store those names by getting it from user in to array that is called 'names'
-print them out by using ->Arrays.toString(); method*/
        Scanner sc= new Scanner(System.in);
        System.out.println("how many names that s/he wants to store in array");
        int number=sc.nextInt();
        String[] names=new String[number];
        sc=new Scanner(System.in);
        //number==names.length   it is the same with names.length or number
        for(int a=0;a<names.length;a++) {
            System.out.println("enter" + (a + 1) + ". name");
            names[a] = sc.nextLine();
        }

            System.out.println(Arrays.toString(names));

    }
}
