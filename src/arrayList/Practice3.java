package arrayList;

import java.util.ArrayList;

public class Practice3 {
    public static void main(String[] args) {


    /*===TASK===:
-Create an ArrayList that will store 5 fruit names
-Print out stored values by using for Loop
*/
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Pear");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Mango");

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        // create a method that will take arraylist as a parameter of fruits
        // this method will print out fruits if it has 5 or more letters
    }

           public static void printFruits(ArrayList<String> fruits) {
                    for (String fruit : fruits) {
                        if (fruit.length() >= 5) {
                            System.out.println(fruit);
                        }
                        System.out.println("=======This is after ");
                    }
                }

                // this method will remove elements that has 4 or less letters from the arraylist
                public static void removeFruits(ArrayList<String> fruits) {
                    for (int i = 0; i <= fruits.size(); i++) {
                        if (fruits.get(i).length() <= 4) {
                            fruits.remove(i);

                        }
                    }
                    System.out.println(fruits);
                }
            }






