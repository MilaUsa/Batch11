package object;

public class TestAnimal1 {
    public static void main(String[] args) {

        Animals duck = new Animals();
        duck.info();
        System.out.println(duck.name);

        Animals bird = new Animals();
        bird.name= "Woody";
        bird.age=30;
        bird.breed="Husky";
        bird.energy=80;
        System.out.println();
    }
}
