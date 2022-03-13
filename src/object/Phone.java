package object;

public class Phone {
    String brand;
    double price=1000;
    String color;
    //constructor
    public Phone(){
        // no argument constructor
        this("Navy Color","Google");
        System.out.println("This is No argument constructor");

    }
  // method to set color
    public void setColor( String color1){
        color=color1;

    }
    //method to call
    public void call(int number){
        System.out.println(number+ " is being called ");
    }
    public Phone(String newColor){
        this.color=newColor;
        System.out.println("This is one argument constructor");
    }
    public Phone(String newColor, String newBrand){
        this.color=newColor;
        this.brand=newBrand;
        System.out.println("This is two argument constructor");

    }
}
