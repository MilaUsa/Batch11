package String;

import java.sql.SQLOutput;

public class Concat {
    public static void main(String[] args) {
        String test = "Chicago";
         String number="1";
         number+="2";
         number+=2;
        System.out.println(number); //122 is the outcome

        // string has built  method /functions you can call by using your variable

        int num = 5;
        test=test.concat(" is the best "); // Chicago is the best
        test=test.concat(" in the summer "); // Chicago is the best in the summer
        System.out.println(test);

       test += test.concat("EVER");
        System.out.println(test);

         String str="just do it";
        System.out.println(str);

        String str1= new String(" What ever it takes!");
        System.out.println(str1);
        System.out.println(str+str1);


    }
}
