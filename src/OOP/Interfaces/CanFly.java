package OOP.Interfaces;

public interface CanFly {
    int  numOfWings=2;
    int numTail=1;

    void fly();
    public default void info(){
        System.out.println("info of CanFly");
    }
}
