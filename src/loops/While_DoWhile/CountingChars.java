package loops.While_DoWhile;

import java.util.Scanner;

public class CountingChars {
    public static void main(String[] args) {
        //-count letters, digits and other characters in the String
        //  String str = "$3%GTlk64mn^y?";
        //  sout("There are <..> letters in the string");
        //  sout("There are <..> digits in the string");



            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter");
            String str= sc.nextLine();
            /*int a=0,countletter=0,countdigit=0;
            do {
                if(str.charAt(a)>='a'&&str.charAt(a)<='z'||str.charAt(a)>='A'&&str.charAt(a)<='Z'){
                    countletter++;
                }
                if (str.charAt(a)>='0'&&str.charAt(a)<='9'){
                    countdigit++;
                }
                a++;
            } while (a<str.length());
            System.out.println("sum of digit is "+countdigit);
            System.out.println("sum of letter is "+countletter);

        }
    }*/
        String str1 = "$3%GTlk64mn^y?".toUpperCase();
        int index=0;
        int letterCounter=0, digitCounter=0, charCounter=0;
        do{
          if(str.charAt(index)>='A' && str.charAt(index)<='Z'){
             letterCounter++;
          }else if(str.charAt(index)>='0' && str.charAt(index)<='9'){
              digitCounter++;
          }else {
              charCounter++;
          }
          index++;
        }while(index<str.length());
        System.out.println("There are "+letterCounter+" letters in the string");
        System.out.println("There are "+digitCounter+" numbers in the string");
        System.out.println("There are "+charCounter+" symbols in the string");
//==========================================================// an other way with while
       /* while(index<str.length()){
            if(str.charAt(index)>='A' && str.charAt(index)<='Z'){
                letterCounter++;
            }else if(str.charAt(index)>='0' && str.charAt(index)<='9'){
                digitCounter++;
            }else {
                charCounter++;
            }
            index++;*/

        }
    }

