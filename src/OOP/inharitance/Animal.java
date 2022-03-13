package OOP.inharitance;

public class Animal {
    public String name;
    String gender;
    int age;
    public Animal run(){
        System.out.println("Animal is running");
        return new Animal();
    }
    public void eat(){
        System.out.println(name+" Animal is eating");
    }
}
