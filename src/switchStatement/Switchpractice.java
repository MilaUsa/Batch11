package switchStatement;

public class Switchpractice {
    public static void main(String[] args) {
        int number=123;
        switch(number){
            case 100:
                System.out.println("this is first case");
                break;
            case 110:
                System.out.println("this is second case");
            case 120:
                System.out.println("tis is third case");
            case 123:
                System.out.println("this is fourth case");
                break;
            case 130:
                System.out.println("this is fifth case");
                defoult:
                System.out.println("this is default case");


        }
        System.out.println("after switch"); // if we don't have default it will show this line
    }
}
