package array;

public class AlphaCharacter {
    // print out alphabetical, digit, and special characters from
    //the string seperetly
    //String given="ertwsFADSF::IJ67585498testtest8732484375efds*&(&*^)5%^";
    // 1 print out alphacharacter
    // 2 print out digit
    // 3 print out special character
    // main method
    public static void main(String[] args) {
        String given="ertwsFADSF::IJ67585498testtest8732484375efds*&(&*^)5%^";
        String onlyAlpabetical="";
        String onlyDigit="";
        String onlySpecial="";
        //what am i supposed to in here
        // we have to a string an you are supposed to seperate the characters from

        for(int i=0; i<given.length(); i++){
            if(Character.isAlphabetic(given.charAt(i))){
                onlyAlpabetical+=given.charAt(i);
            }else if(Character.isDigit(given.charAt(i))){
                onlyDigit+=given.charAt(i);

            }else{
                onlySpecial+=given.charAt(i);
            }
        }
        System.out.println(onlyAlpabetical);
        System.out.println(onlyDigit);
        System.out.println(onlySpecial);
            }
        }


