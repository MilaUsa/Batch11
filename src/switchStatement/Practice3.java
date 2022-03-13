package switchStatement;

import java.util.Locale;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        // ask user for name of geometrical shape
        //based on the name of the shape
        //calculate the area og that shape
        //get length, width for rectangle
        //get height and base for triangle from user to use them in calculations
        //print out name of the shape and area of that shape
        // -triangle, rectangle
        // rectangle=l*w triangle=(base*height)/2
        Scanner sc= new Scanner(System.in);
        System.out.println("Which shape you want to calculate area of? triangle/rectangle");
        String shape=sc.nextLine().toLowerCase();
        switch(shape){
            case "triangle":
                System.out.println("Please enter height of triangle");
                double h=sc.nextDouble();
                System.out.println("Please enter base of triangle");
                double b=sc.nextDouble();
                System.out.println("The area of triangle is:" +b*h/2);
                break;
            case "rectangle":
                System.out.println("Please ask length of rectangle");
                double l=sc.nextDouble();
                System.out.println("please enter width of rectangle");
                double w=sc.nextDouble();
                System.out.println("the area of rectangle is:" +l*w);
                break;
            default:
                System.out.println("you shape selection is not option for us");
                break;
        }

    }
}
