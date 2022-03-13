package OOP.Interfaces;

public class Eagle implements CanFly {
    String color;
    public void fly() {
        System.out.println("Eagle is flying");
    }

    @Override
    public void info() {

    System.out.println("Eagle is:" +color);
        }

    @Override
    public String toString() {
        return "Eagle{" +
                "color='" + color + '\'' +
                '}';
    }
}


