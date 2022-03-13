package primitives;

public class unaryPractice2 {
    public static void main(String[] args) {

        int a=7;
        int b=4;
        int result = --a + --b + a++ *2 - b++ * a--;
                    //6  +  3  + 6 * 2 - 3  *7;  //0
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
//------------------------------------------------------
        int donutNumber=12;
        int eachDonut=2;
        int total=donutNumber*eachDonut;
        System.out.println(total);// DD
        System.out.println(--total);//KK

    }
}
