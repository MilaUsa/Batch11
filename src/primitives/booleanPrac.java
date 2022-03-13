package primitives;



public class booleanPrac {

    public static void main(String[] args) {

        boolean isHungry = true;
        System.out.println(isHungry);

        boolean isLightOn = false;
        System.out.println(isLightOn);

        System.out.println(true);
        System.out.println(isHungry == isLightOn);

        isLightOn = isHungry;
        isLightOn = false;

        System.out.println("last version for isHungry "+ isHungry); //true
        System.out.println("last for is Light " +isLightOn); //false

        //substraction-------

        int num2=6;
        int difference;
        difference=10-num2;
        System.out.println("diference is= " + difference);



    }
}
