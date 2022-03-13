package String;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerPractice6 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double balance =200;

        System.out.println("how much is deposit amount?");

        double firstCheck=input.nextDouble();
        balance+=firstCheck;
        System.out.println("how much is deposit amount?");
        double secondCheck=input.nextDouble();
        balance+=secondCheck;
        System.out.println("how much is deposit amount?");
        double thirdCheck=input.nextDouble();
        balance+=thirdCheck;
        System.out.println("how much is the phone?");
        double phone$=input.nextDouble();
        balance-=phone$;
        System.out.println("how much is headPhone?");
        double headPhone$= input.nextDouble();
        balance-=headPhone$;
        System.out.println("your final balance is" +balance);

    }
}
