package object;

public class TestStatic {
    public static void main(String[] args) {
        // you can call static methods from
        // another class by using name of the class , no need to create an object
        StaticPetPractice.eat();
        StaticPetPractice pet= new StaticPetPractice();
        pet.eat();

        pet.play();
    }

}
