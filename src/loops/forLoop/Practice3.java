package loops.forLoop;

public class Practice3 {
    public static void main(String[] args) {
       // print out every letter from the string
        //print index number of the letter and* together with letter>> 0*t 1*o 2*d
        String str= "today is Snowy";
        for(int a=0;a<str.length();a++){
            System.out.println(str.charAt(a));
        }
        for(int index=0;index<str.length();index++){
            System.out.print(index+ "*"+str.charAt(index));
        }
        System.out.println();
        //print out only letter 'y' from the string
        for(int b=0; b<str.length(); b++){
            if(str.charAt(b)=='y') {
                System.out.println(str.charAt(b));
            }
        }
        // count the number of letter 'n' in the given String
        // there are ...'n' in the string
        //int count;
      // for(int i=0; i<str.length(); i++ ){
           //if(str.charAt())
      // }
}}
