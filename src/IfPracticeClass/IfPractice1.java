package IfPracticeClass;

public class IfPractice1 {
    public static void main(String[] args) {
        int appleNumber=5;
        int orangeNumber=10;

        //==, >, <, !=, <=, >=

        System.out.println("I am about to create an If block");

        if(appleNumber==orangeNumber){                     //false second part will skiped
            System.out.println(("I am so lucky today"));
        }
        if(appleNumber!=orangeNumber){
            System.out.println("I am so happy");
        }

        if(appleNumber<=orangeNumber){
            int sum = appleNumber+orangeNumber;
            System.out.println("you have " +sum+" fruits");
        }
        System.out.println("So far so good");

        if(orangeNumber<appleNumber){
            System.out.println(orangeNumber+appleNumber+ " is in the false conditional if block. that is why it will not" +
                    "show on the console");
        }

    }



}
