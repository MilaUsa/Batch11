package loops.forLoop;

public class PalindromePractice {
    public static void main(String[] args) {
        // efe,1234321, civic, ana
        String str="civic";
        String reverse ="";
        for(int i=str.length()-1; i>0; i--){
            reverse +=str.charAt(i);
        }
        if(reverse.equalsIgnoreCase (reverse)){
            System.out.println("It is palindrome string");
        }else {
            System.out.println("It is Not a palindrome string");
        }
        //find out if given number is palindrome number or not
        //int number=1234321;
       // String str1=""+number;


    }
}
