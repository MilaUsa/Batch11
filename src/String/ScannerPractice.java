package String;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] mila) {

        String name="David";
        System.out.println("My name is "+name);

        //creating scanner object

        Scanner input= new Scanner(System.in);

        System.out.println("Please enter your lastname");

        //Task:Ask user to enter his/her city name and print as:<name><last Name> you are living in <city>"


        String lastName= input.nextLine();

        System.out.println(lastName);

        System.out.println("please enter your city name");
        String city = input.nextLine();
        System.out.println(name + " "+lastName+ "you are living in "+city);

        System.out.println("Please enter your age");
        int age=input.nextInt();
        System.out.println(name +" your age is very good age "+age);

        System.out.println("Please enter your height in feet and inches(i.e: 5.8");

      double height = input.nextDouble();
        System.out.println("your height is "+height);


        System.out.println("Please enter yor address");
       input = new Scanner(System.in);
       String address = input.nextLine();
        System.out.println("Is this address you provided?"+address);



    }


}
