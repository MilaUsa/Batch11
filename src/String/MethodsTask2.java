package String;

import java.util.Locale;

public class MethodsTask2 {
    public static void main(String[] args) {
        String str=" Zero to ten ";
        str=str.replace("ten","Hero");
        System.out.println(str);
        str=str.toUpperCase();
        System.out.println(str);
        str=str.trim();
        System.out.println(str);
        str=str.replace(" ","");
        System.out.println(str);
        str=str.substring(0,3);
        System.out.println(str);
        int x = str.length();
        System.out.println(("The length of final version is: " +x));

        //method chaining ==> you can use method after method
        System.out.println(str.replace("ten","Hero").toUpperCase().trim().
                replace(" ","").substring(0,3).length());

         int a=str.replace("ten","Hero").toUpperCase().trim().
                replace(" ","").substring(0,3).length();

    }
}
