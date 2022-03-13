package RecapJava;

public class ArraysAndSplitMethod {
    public static void main(String[] args) {
      //I want to reverse each of the words
        // output: olleH avaJ si os looc;
      String name="Hello Java is so cool";


       String[] a=name.split("");
       for(int i=0;i<a.length;i++){
           String reverse="";
       for(int k =a[i].length()-1; k>=0;k--) {
           reverse = reverse + a[i].charAt(k);
       }

        System.out.println(reverse+",");
       }
    }}



