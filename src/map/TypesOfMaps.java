package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TypesOfMaps {
    public static void main(String[] args) {
        HashMap<Integer,String> drinks1= new HashMap<Integer, String>();
        LinkedHashMap<Integer,String> drinks2= new LinkedHashMap<>();
        TreeMap<Integer,String> drinks3= new TreeMap<>();
        drinks1.put(9,"Water");        drinks2.put(9,"Water");                   drinks3.put(9,"Water");
        drinks1.put(7,"Coke");         drinks2.put(7,"Coke");                     drinks3.put(7,"Coke");
        drinks1.put(11,"Tea");         drinks2.put(11,"Tea");                       drinks3.put(11,"Tea");
        drinks1.put(2,"Coffee");        drinks2.put(2,"Coffee");                     drinks3.put(2,"Coffee");
        drinks1.put(5,"Pepsi");          drinks2.put(5,"Pepsi");                      drinks3.put(5,"Pepsi");
        drinks1.put(null,"Mineral Water"); drinks2.put(null,"Mineral Water");      //drinks3.put(null,"Mineral Water");
        drinks1.put(22,null);            drinks2.put(22,null);                       drinks3.put(22,null);

        System.out.println(drinks1);
        System.out.println(drinks2);
        System.out.println(drinks3);

        System.out.println(drinks3.get(9));//water
        // print out all values by using get method, create a new method for it
        System.out.println("---------------------------------------------");
        printvalues(drinks1);
        System.out.println(drinks3.keySet());
        System.out.println(drinks3.values());

    }
    public static void printvalues(Map<Integer,String> storage){
       // System.out.println(storage.get());
        for(Integer drinkKey:storage.keySet()){
            System.out.println(storage.get(drinkKey));
        }
    }
}
