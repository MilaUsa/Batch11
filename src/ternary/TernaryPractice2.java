package ternary;

public class TernaryPractice2 {
    public static void main(String[] args) {
        int  a=3, b=5, k=7;
        // increments ++/ decrements--
       int r1= a>=k ? a + k++ : ++b +k; //5+1=6+7=13
        System.out.println(r1);

        int r2= k< ++b ? 2 * ++k - 2 : --k *2-1; //6*2-1=11

        System.out.println(r2);
        System.out.println(k>= b ? "I got this" : false);
        System.out.println("test".equals("test")? "TEST".toLowerCase(): 99); //
    }
}
