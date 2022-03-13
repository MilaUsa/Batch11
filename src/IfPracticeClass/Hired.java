package IfPracticeClass;

import java.util.Scanner;

public class Hired {
    public static void main(String[] args) {
        //=Task==
        //
        //  nested if >>>> java>selenium>API>Sql
        //  ask user:
        //        -s/he knows Java yes/no
        //                yes: ask s/he knows Selenium
        //
        //                        can learn: ask s/he has API testing experience
        //                        yes: ask s/he has API testing experience
        //                        no: we need someone who is familiar with Selenium
        //                                yes: ask s/he has Sql knowledge
        //                                        yes: "Congrats!! You are HIRED!!"
        //                                        no: We need someone who has Sql knowledge
        Scanner sc=new Scanner(System.in);
        System.out.println("do you know JAVA?yes/no");
        String ja=sc.nextLine();
        if(ja.equalsIgnoreCase("yes")){
            System.out.println("Do you have  API Selenium experience? yes/no/learn");
                    String  selen =sc.nextLine();
            if(selen.equalsIgnoreCase("yes")|| selen.equalsIgnoreCase("learn")){

                String api=sc.nextLine();
                if(api.equalsIgnoreCase("yes")){
                    System.out.println("do yoy have Sql knowledge? yes/no");
                    String sql=sc.nextLine();
                    if(sql.equalsIgnoreCase("yes")){
                        System.out.println("Congrats!! Hired!!!");



        }else {
                        System.out.println("We need  someone with sql knowledge");
                    }
                }else{
                    System.out.println("We need  someone with Api knowledge");
                }
        }else {
                System.out.println("We need  someone with Selenium knowledge");
            }

            }else{
                System.out.println("You should learn at one programming language");
            }

        }
        }



