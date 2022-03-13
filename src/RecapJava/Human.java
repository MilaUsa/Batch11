package RecapJava;

import java.util.HashSet;
import java.util.Set;

public class Human {
    public static void main(String[] args) {
        String str="Java";
        String reversed="";
        for(int i=0; i<str.length();i++){
            reversed+=str.charAt(i);
            System.out.println(reversed);
        }
       // print only the letters the index number is odd  1,3,5
        String name ="Ahmet";
        String index="";
        for(int i=1; i<str.length();i+=2){
            index+=name.charAt(i);
        }
        System.out.println(index);

    }
}
