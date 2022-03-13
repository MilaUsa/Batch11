package object;

public class StaticPetPractice {
    String name;
    int age;
    String color;
    static double food=20;

    public static void eat(){
       String color="red";
        food-=1;
        System.out.println("Food amount is now:"+ food);
        StaticPetPractice pet9=new StaticPetPractice();
    }
    // non -static method can be called without object from a static method
    // play();
    public void play(){
        System.out.println("Pet is playing");
        eat();
        StaticPetPractice.eat();
        food=100;
        color="Blue";
    }

      public static void main(String[] args) {
        StaticPetPractice pet1= new StaticPetPractice();
        pet1.eat(); //19
        pet1.eat();// 18

        StaticPetPractice pet2= new StaticPetPractice();
        pet2.eat();

        eat(); //or
        StaticPetPractice.eat();
    }

}
