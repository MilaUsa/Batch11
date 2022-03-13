package arrayList;

import java.util.ArrayList;

public class FlowerTest {
    public static void main(String[] args) {

        Flower flower1= new Flower("white", "tulip",15);
        Flower flower2= new Flower("red", "rose",15);
        Flower flower3= new Flower("pink", "",15);

        ArrayList<Flower> flowers= new ArrayList<>();
        flowers.add(flower1);
        flowers.add(flower2);
        flowers.add(flower3);
        System.out.println(flowers);
        for(Flower flow:flowers){
            System.out.println(flow.name+"is"+flow.price);
        }
        System.out.println(totalPrice(flowers));
       double flowerCost= Flower.totalPrice1(flowers);
        System.out.println("This is cost calculation from totalPrice1 method"+flowerCost);
    }
    // create a method that will take a parameter as ArrayList of Flowers
    //this method will return total prices of the flowers
    public static double totalPrice(ArrayList<Flower> group){
        double sum=0;
        for(Flower f:group){
            sum+= f.price;

        }

        return sum;
    }
}
