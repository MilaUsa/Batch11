package OOP.Inheritance3;

public class Vehicle {
    //-Vehicle
    //  Variables:
    //    protected  model;
    //    default year;
    //    public brand;
    //  Methods:
    //    drive(); --> vehicle is moving
    //    stop(); --> return true, vehicle is stopping
    //    protected start(); --> return true, vehicle is starting
    //    default accelerate(); --> return Object
    //  Constructor: create a constructor to initiliaze instance variables
    //-Car
    //  *extends Vehicle
    //  variables:
    //    model;
    //    engineType;
    //  Methods:
    //    Override drive(); --> Car is moving
    //    Override accelerate(); --> return Integer and calls model from parent class
    protected String model;
    int year;
    public String brand;

     void drive(){
        System.out.println("Vehicle is moving");
    }
     boolean stop(boolean isStopped){
        System.out.println("Vehicle is stopping");
        return isStopped;
    }
    protected boolean start(boolean isStarting){
        System.out.println("Vehicle is starting");
        return isStarting;
    }
    Vehicle accelerate(String model, int year, String brand){
        System.out.println("Vehicle is accelerating ");
        return new Vehicle(model, year, brand);
    }

    public Vehicle(String model, int year, String brand) {
        this.model = model;
        this.year = year;
        this.brand = brand;
    }
}
