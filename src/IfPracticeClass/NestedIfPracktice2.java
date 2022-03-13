package IfPracticeClass;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class NestedIfPracktice2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Which city you live in?");
        String city=sc.nextLine();
        if(city.equalsIgnoreCase("Chicago")){
            System.out.println("wich course are you attending?");
            String course=sc.nextLine();
            if(course.equalsIgnoreCase("Techtorial")){
                System.out.println("which batch are you in?");
                String batch=sc.nextLine();
                if(batch.equalsIgnoreCase("11")){
                    System.out.println("It is getting easier!!!");
                }
            }else{
                System.out.println("We are at Des Planes, please visit us");
            }

        }else{
            System.out.println("Please come to chicago, you will like it in the summer");
        }
    }
}
