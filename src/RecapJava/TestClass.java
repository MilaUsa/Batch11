package RecapJava;

import java.util.concurrent.Callable;

public class TestClass {
    public static void main(String[] args) {
        GroceryStore houstonStore= new GroceryStore();
       GroceryStore seattleStore=new GroceryStore();
        GroceryStore houstonStore1= new GroceryStore(543,0.99,429,0.87);
        GroceryStore seattleStore2=new GroceryStore(765,0.86,842,0.91);


        int a=houstonStore.numberOfSoldApples=534;
       double a1=houstonStore.priceOfEachApple=0.99;
       int a3=houstonStore.numberOfSoldOranges=429;
       double a4=houstonStore.priceOfEachOrange=0.87;

       int b=seattleStore.numberOfSoldApples=765;
      double b1= seattleStore.priceOfEachApple=0.86;
       int b3=seattleStore.numberOfSoldOranges=842;
       double b4=seattleStore.priceOfEachOrange=0.91;

        System.out.println("Apples sold- "+a);
        System.out.println("Apple retail cost- "+a1);

        System.out.println("Oranges sold- "+a3);
        System.out.println("Orange retail cost- "+a4);

        System.out.println("Apples sold- "+b);
        System.out.println("Apple retail cost- "+b1);

        System.out.println("Oranges sold- "+b3);
        System.out.println("Orange retail cost- "+b4);

        houstonStore.grossRevenue("Huston");
        seattleStore.grossRevenue("Settle");

    }
}
