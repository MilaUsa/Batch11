package IfPracticeClass;

public class curlyBracketPractice {
    public static void main(String[] args) {
        int number=1234;
        if(number==1234)
        System.out.println("number is something 1234");
        System.out.println("number is not equals to 1234");
        if (number ==5)
            System.out.println("Hello World"); // if we are not using curly brackets it will
        // skiping next first line
        System.out.println("hello JAVA");
        System.out.println("hello selenium");
        System.out.println("hello alex");
        System.out.println("hello All");

 int num1=6;
 if(num1<10)
     num1++;
        System.out.println(num1);

        int num2=4;
        if(num2>20)
            num2++;
        System.out.println(num2);

        if(num2>20){
            num2++;
            System.out.println("I am in the Curly--->" +num2);
            int a;
            if(1==1)
                a=2+2;
            System.out.println("--------");
            System.out.println(a);
        }

    }
}
