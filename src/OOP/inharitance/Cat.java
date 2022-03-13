package OOP.inharitance;

public class Cat extends DomesticAnimal{
    @Override
    public void eat() {
        System.out.println(name+" cat is eating");
        Animal animal= new Cat();
    }
}
