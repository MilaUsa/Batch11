package object;

import java.util.Scanner;

public class TestAnimal {
    public static void main(String[] args) {
        String str= new String("test");
        Scanner scanner=new Scanner(System.in);
        Animals cat = new Animals();
        System.out.println(cat.name);
        cat.name="Leo"; //initionalisen
        System.out.println(cat.name); //Leo
        System.out.println(cat.age);
        System.out.println(cat.color);
        cat.age=9;
        cat.color="orange";
        System.out.println(cat.age);
        System.out.println(cat.color);
        Animals dog=new Animals();
        dog.name="Chalsy";
        dog.age=6;
        dog.color="white";
        System.out.println(dog.name.concat(cat.name));
        System.out.println(dog.age);
        System.out.println(dog.color);
        System.out.println(dog.breed);
        System.out.println(cat.breed);
        cat.breed="Scottish";
        System.out.println(cat.breed);

        cat.sleep();
        dog.sleep();
        cat.eat();
        cat.run();
        System.out.println(cat.energy);
        System.out.println(dog.energy);
        cat.run();
        cat.run();

        // charge up the animal when they sleep;
        cat.sleep();
        System.out.println(cat.energy);




        // create a dog animal, try to use instance variables with your new object
    }
}
