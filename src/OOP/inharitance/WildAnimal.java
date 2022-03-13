package OOP.inharitance;

public class WildAnimal extends Animal{
    String name;
public void hunting(){
    System.out.println("Wild animal is hunting");
}

    @Override
    public Animal run() {
        System.out.println(name+ " is running");
        return new Animal();
    }
}
