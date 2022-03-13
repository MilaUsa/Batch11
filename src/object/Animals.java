package object;

public class Animals {
    String name; //declare  variable
    int age;                            // clobal variables or instance variables
    String color;
   String breed="Boxer";  // it is ok but it gives default because it is usefull for every animals
   int energy= 100;


 public void sleep(){          //local variable
        int energy=100;
     System.out.println(name+"is sleeping");
     System.out.println(name+ " is charging up "+energy);

 } public void eat(){

     System.out.println(name+ " is eating");
    }
       public void run(){
      energy= energy-10;
           System.out.println(name+ " has "+energy+"percent energy");
       }
      public void info() {
          System.out.println("Name is: "+name + "Age is: " + age + "Color is: " + color + "Energy is: " + energy);
      }
      }


