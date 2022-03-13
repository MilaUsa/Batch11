package OOP.Inheritance1;

public class Flower {
    String color;
    double price;
    int size;

    public Flower(String color, double price, int size){
        this.color=color;
        this.size=size;
        this.price=price;

    }

    public Flower(){

    }

    @Override
    public String toString() {
        return "Flower{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }

    public double getPrice(){
        return price;
    }


}
