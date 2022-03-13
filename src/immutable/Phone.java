package immutable;

public class Phone {       //it is not public

   private double price=500;
   private String color="red";
    private String brand="own";


    public double getPrice(){
        return price;
    }
   public String getColor(){
        return color;
   }
   public String getBrend(){
        return brand;
   }




    public static void main(String[] args) {
        Phone phone = new Phone();

        System.out.println(phone.price);
        phone.price=900;
        System.out.println(phone.price);
    }


}
