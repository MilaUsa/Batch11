package switchStatement;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        // 1- IT dept
        // david, Tima
        // 2- Admin
        // Alex, Jessi
        //3- Customer Care
        // Zack, Ana, John
        //who do you want to speak with? please enter name: David, Tima
        Scanner sc = new Scanner(System.in);
        System.out.println("which department do you want to connect?please select from following options" +
                "\n 1- IT department\n2-Admin\n3 Costomer care");
        int dept = sc.nextInt();

        switch (dept) {
            case 1:
                System.out.println("you are in IT dept.who do you want to speak with? please enter name: " +
                        "David, Tima ");
                sc = new Scanner(System.in);
                String name = sc.nextLine().toLowerCase();
                switch (name) {
                    case "david":
                        // want to differ morning and afternoon hours
                        int hour = LocalDateTime.now().getHour();
                        System.out.println(hour);
                        if (hour > 8 && hour < 12) {
                            System.out.println("I am still not in the office");
                        } else if (hour > 12 && hour < 17) {

                        System.out.println("Hello this is David");
                }else{
                System.out.println("This is not good time");
            }
            break;
            case "tima":
                System.out.println("Hello this is Tima");
                break;
            default:
                System.out.println("We don't have " + name);
                break;
        }
        break;

        case 2:
        System.out.println("you are in Admin dept.who do you want to speak with? please enter name: " +
                "David, Tima ");
        sc = new Scanner(System.in);
        String name1 = sc.nextLine().toLowerCase();
        switch (name1) {
            case "david":
                System.out.println("Hello this is Alex");
                break;
            case "Jessi":
                System.out.println("Hello this is Jesi");
                break;
            default:
                System.out.println("We don't have " + name1);
                break;
        }

        break;
        case 3:
        System.out.println("you are in Customer dept.who do you want to speak with? please enter name: " +
                "Zack, Anna, John");
        sc = new Scanner(System.in);
        String name3 = sc.nextLine().toLowerCase();
        switch (name3) {
            case "david":
                System.out.println("Hello this is Zack");
                break;
            case "Anna":
                System.out.println("Hello this is Anna");
                break;
            case "john":
                System.out.println("Hello this is  John");
                break;
            default:
                System.out.println("We don't have " + name3);
                break;

        }
        break;

            default:
                System.out.println("Your selection is not valid for department Number");
        }

    }
}
