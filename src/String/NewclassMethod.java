package String;

import java.util.Scanner;

public class NewclassMethod {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your gender, full name and birth year in the following format\n" +
                "         F- Jenny Brown -1999");
         String client=scanner.nextLine();
        System.out.println(client.startsWith("F"));
        System.out.println(client.endsWith("M"));
        System.out.println(client.contains("Milana"));
        System.out.println(client.endsWith("2000"));
        System.out.println(client.replace('-','/'));



    }
}
