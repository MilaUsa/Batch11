package object;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone= new Phone();

        System.out.println("***"+phone.color);
        System.out.println("#######"+phone.brand);
        phone.brand="I-Phone";
        phone.call(111);
        Phone phone1= new Phone();


        Phone phone2= new Phone("pink");
        System.out.println(phone2.color);
        Phone phone3= new Phone("black","samsung");
        System.out.println(phone3.brand);

    }
}
