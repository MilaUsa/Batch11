package OOP.Interfaces;

public class Test {
    public static void main(String[] args) {
        Shark shark = new Shark();
        shark.swim(4);
                Duck duck= new Duck();
                duck.fly();
                duck.swim(2);

        Eagle eagle= new Eagle();
        eagle.color="white";
        System.out.println(shark);
        System.out.println(eagle);
        System.out.println(duck);
       // System.out.println(duck.FIN); you can not reinitialize variables
        // which coming from interface
        // interface variables are public and final by default
        duck.info();
        //duck.name =
        System.out.println(duck.name);
        duck.name="Puffy";
        System.out.println(duck.name);

    }
}
