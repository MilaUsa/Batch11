package OOP.inharitance;

public class Lion extends WildAnimal{
    @Override
    public Lion run() {
        return new Lion();
    }
}
