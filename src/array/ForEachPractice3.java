package array;

import java.util.Arrays;

public class ForEachPractice3 {
    public static void main(String[] args) {
        String[] names={"John", "Brian", "Easy","Nina","david"};
        //create e -mail address for each of the names in the array
        //john@gmail.com, brain@gmail.com
        // store these e-mails in an array
        //if it is gamil e-mail, store it in gmail array
        //if it is yahoo e-mail,store it in yahoo array
        String[] gMails= new String[names.length];
        String[] yahooMails= new String[names.length];
        for(String name:names){

            System.out.println(name+"@gmail.com");
            System.out.println(name.toUpperCase().concat("@yahoo.com"));

        }
        System.out.println("****************************");
        for(int i=0; i<names.length; i++){
            String email=names[i]+"@gmail.com";
            String yMail=names[i].toUpperCase().concat("@yahoo.com");
            gMails[i]=email;// or gMails[i]=names[i]+"@gmail.com";
            yahooMails[i]=yMail;// or yahooMails[i]=names[i].toUpperCase().concat("@yahoo.com");
        }
        System.out.println(Arrays.toString(gMails));
        System.out.println(Arrays.toString(yahooMails));
    }
}
