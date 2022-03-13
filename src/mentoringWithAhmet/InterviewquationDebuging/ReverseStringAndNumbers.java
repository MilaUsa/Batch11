package mentoringWithAhmet.InterviewquationDebuging;

import java.util.Scanner;

public class ReverseStringAndNumbers {
    public static void main(String[] args) {
        //ask user to input a word and reverse it
        //ask user to input a number and reverse it
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a word");

        String word=sc.nextLine();

         //you have to know the meaning of the reverse(opposite) ahmer--temha
        //        // how am I going to reverse a string?
        //        //how can i reach out each of the characters from string?
        //        //where am I soing to store them

               String name="";
                for(int i=word.length()-1; i>=0; i--){
                  name+=word.charAt(i); // name=name+word.charAt(i);

                }
        System.out.println(name);

        System.out.println("Please enter a number");//1234
        int number=sc.nextInt();
        int reverse=0;
        while(number!=0){
            reverse=reverse*10+number%10; //0*10+1234%10=4   4*10+123%10=40+3=43  43*10+12%10=432 4320+1=4321
            number=number/10; //1234/10=123   123/10=12  12/10=1  1/10=0
        }

        System.out.println(reverse);

        int num1=12345;
        int rev=0;
        while(0<num1){
            rev=rev*10+num1%10;
            num1=num1/10;
        }
        System.out.println(rev);
    }
}
