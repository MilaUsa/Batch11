package object;

public class Numbers {
    public static void main(String[] args) {
        MathPractice object=new MathPractice();
        object.sum();
        object.total(4,5);
        object.total(10,5);
        object.total(224334,56);
       // System.out.println(object.sum());
        //you can not use method which
        // has return type void in the sout

       int a= object.sum2(2,3);
       int x=a*a;
       object.total(x,12);

      String str=object.speak();
        System.out.println(str);
        System.out.println(object.speak());

        // call number to string method and do concatenation
        //with your first and last name and print it out
        System.out.println(object.numberToString(2.5).concat("Milana"));
    }
}
