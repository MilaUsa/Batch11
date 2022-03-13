package OOP.Interfaces;

public class Puffin extends CanRun implements  CanFly, CanSwim{
    @Override
    public void fly() {
        System.out.println("Puffin is flying");
    }

    @Override
    public void info() {
        System.out.println("Info of Puffin");
    }

    @Override
    public int swim(int mile) {
        System.out.println("Puffin is swiming");
        return 0;
    }

    public void run() {
        System.out.println("Puffin is running");
    }


}
