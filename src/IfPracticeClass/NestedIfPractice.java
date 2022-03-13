package IfPracticeClass;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class NestedIfPractice {
    public static void main(String[] args) {
        //passport
        //visa
       // ticket
        Scanner scanner= new Scanner(System.in);
        System.out.println("do you have a passport? yes/no");
        String passport=scanner.nextLine();
        if(passport.equalsIgnoreCase( "yes" )){
        System.out.println("do you have a Visa? yes/no");
        if(scanner.nextLine().equalsIgnoreCase("yes")){
            System.out.println("do you have a ticket? yes//no");
            if(scanner.nextLine().equalsIgnoreCase("yes")){
                System.out.println("Enjoy your flight to our country");
            }else {
                System.out.println("Please get a ticket");
            }
            }else{

                System.out.println("You need to get visa");
            }
    } else {
        System.out.println("please get a passport first");
    }}

}
