package object;

import java.time.LocalDateTime;
import java.util.Scanner;

public class MethodPractice {
    /* `create a method that will calculate age of a person,
    `does not return age,
    `will take birth year as parameter,
    `user provides the birth year
    `will print age of person*/
    public void ageCalculater(int birthYear) {
        //Scanner scanner= new Scanner(System.in);
        // System.out.println("Please enter your birth year");
        // birthYear=scanner.nextInt();
        int age = LocalDateTime.now().getYear() - birthYear;
        System.out.println("Your age is: " + age);
    }
    //overload ageCalculator method by passing name of the person as parameter and
    //return age
    public int ageCalculater(int birthYear,String name) {

        int age = LocalDateTime.now().getYear() - birthYear;
        System.out.println(name+"Your age is: " + age);
        System.out.println("Overloaded age calculator method");
        return age;
    }

    // create a method that will take int array as a parameter
    // it will calculate sum of the numbers in this array
    //it will return the sum as double

    public static void main(String[] args) {
        MethodPractice object = new MethodPractice();
        object.ageCalculater(1985);

        int[] nums={1,2,3,4,5,6,7};
       double s= object.sumOfArrayElements(nums);
        System.out.println(s);
        System.out.println(object.sumOfArrayElements(nums));
       double w= object.sumOfArrayElements(new int[] {1,2,3,4});
        System.out.println(w);
    }



    //Array{1,2,3,4}
    public double sumOfArrayElements(int[] ids){
        double sum=0;
        for(int id:ids){
            sum+=id;
        }
        return sum;

    }
}