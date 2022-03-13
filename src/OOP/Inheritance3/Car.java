package OOP.Inheritance3;

public class Car extends Vehicle{
    String model;
    String engineType;

    public Car(){
        super("Camry", 2022, "toyota");
    }



    public void drive() {
        System.out.println(" Car is moving ");
    }


    Vehicle accelerate() {
        System.out.println(super.model);
        System.out.println("Car is accelering");
        Car car= new Car();
        return car;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engineType='" + engineType + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Car car= new Car();

       car.accelerate();

    }
}
