package arrayList;

import java.util.ArrayList;

public class Flower {
    String color;
    String name;
    double price;

    public Flower(String color, String name, double price) {
        this.color = color;
        this.name = name;
        this.price = price;

    }

    @Override
    public String toString() {
        return "Flower{" +
                "color='" + color +
                ", name='" + name +
                ", price=" + price +
                '}';
    }
    public static double totalPrice1(ArrayList<Flower> group){
        double sum=0;
        for(Flower f:group){
            sum+= f.price;

        }

        return sum;
    }

}
