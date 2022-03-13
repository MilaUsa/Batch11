package String;

import java.util.Scanner;

public class SelfPacticeScanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("p e f s");
        int fScore= scanner.nextInt();
        System.out.println("p e s s");
        int sScore= scanner.nextInt();
        System.out.println("p e f s");
        int tScore= scanner.nextInt();
        System.out.println("p e s attend");
        int exAttend= scanner.nextInt();
        boolean exPass=exAttend>=80 && fScore%20>=65 && sScore%30>=65 && tScore%50>=65;
        System.out.println(exPass);

    }
}
