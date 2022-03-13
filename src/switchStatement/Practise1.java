package switchStatement;

import java.util.Scanner;

public class Practise1 {
    public static void main(String[] args) {
        // get a number between 1 to 4 from user print out name of season as:
       // 1--> Winter
        //2--> String
        Scanner sc= new Scanner(System.in);
        System.out.println("Plese enter number between 1 to 4");
        int number=sc.nextInt();
        switch(number){
            case 1:
               System.out.println("Winter");
            case 2:
                   System.out.println("Spring");
                   case 3:
                       System.out.println("Summer");
            case 4:
                System.out.println("Autumn");
        }
    }
}
