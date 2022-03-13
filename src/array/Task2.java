package array;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //  -ask user, how many names that s/he wants to store in array
        //-store those names by getting it from user in to array
        // if the name has 5 or more letters store it in 'longNames array
        // if the name has less then 5 letters store it on 'shortNames' array
        //-print both array by using ->Arrays.toString(); method
        Scanner sc= new Scanner(System.in);
        System.out.println("how many names that s/he wants to store in array");
        int number=sc.nextInt();
        String[] longNames=new String[number];
        String[] shortNames=new String[number];
        sc=new Scanner(System.in);
        //number==names.length   it is the same with names.length or number
        for(int a=0;a<number;a++) {
            System.out.println("enter" + (a + 1) + ". name");
            String name=sc.nextLine();
           if(name.length()>=5){
               longNames[a]=name;
           } else{
               shortNames[a]=name;


        }

        System.out.println(Arrays.toString(longNames));
            System.out.println(Arrays.toString(shortNames));


    }
}



    }

