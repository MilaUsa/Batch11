package map;

import java.util.HashMap;


public class Task2 {
    public static void main(String[] args) {


        //String [] drinks={"Coke","Water","Coke","Coffee","Ayran", "Water"};
        //you want to store these drinks in to a map with the amount that how many times that you see them in the array
        String[] drinks = {"Coke", "Water", "Coke", "Coffee", "Ayran", "Water"};
        HashMap<String, Integer> map= new HashMap<>();
        for (String drink:drinks) {
            if(!map.containsKey(drink)){
       map.put(drink,1);
        }else{
            map.put(drink,map.get(drink)+1);
            }
        }
        System.out.println(map);
    }

    }

