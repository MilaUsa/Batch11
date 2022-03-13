package primitives;

public class logicalNegation {
    public static void main(String[] args) {

        boolean isLightOn=true;
        System.out.println(isLightOn);

        System.out.println(!isLightOn);


        System.out.println(5 == 5);
        System.out.println(!(5 == 5));

        boolean haveMoney = false;
        haveMoney =!haveMoney;
        System.out.println(haveMoney); //true

        System.out.println("......." + isLightOn);
        System.out.println("*******" +haveMoney);
        System.out.println(isLightOn == haveMoney);
        System.out.println(!(isLightOn == haveMoney)); 
    }
}
