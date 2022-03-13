package OOP.FinalPractice;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Shirt {

   final String COLOR="white";
    double price;
    char size;
    String material;

    public Shirt(String color, double price, char size, String material) {
       // this.color = color;---> it will not compile,since Color is final
        this.price = price;
        this.size = size;
        this.material = material;
    }
    public void setCOLOR(String color){
        //this.COLOR=color; //it will not compile,since Color is final
    }
    public Shirt(){
        System.out.println("This is no argument constructor");
    }


   final public void wash(){
        System.out.println("You can wash this Shirt");
    }
    public boolean fit(char size){
        if(this.size==size){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Shirt shirt = new Shirt();
        System.out.println(shirt.COLOR);
    }
}
