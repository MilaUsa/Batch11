package String;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        // BMI calculation   BMI=weight(kg)/(height* height(meter));
        // 18-24;
        // "your BMI is<BMI>'
        // WE HAVE TO ASK  IT TWO TIMES


        Scanner scanner=new Scanner(System.in);
        System.out.println("Please  can you give me your weight in kg");
        double weight= scanner.nextDouble();
        System.out.println("please enter your height in meter (i.e:1.8)");
        double height= scanner.nextDouble();
        double BMI = weight / ( height *height );
        System.out.println("Your BMI is" +BMI);







    }
}
