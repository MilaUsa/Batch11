package RecapJava;

import java.util.HashMap;
import java.util.TreeMap;

public class Map {
    /*ce
    1. can you tell me about map and why do you use map in your project?
    map is an interface that i used in my framework to store my data as KEY_VALUE pairs.
    FE: in my finance company i was verifying the customers name with their SSN number.
    At this time all data was coming from our Hashmap.

    2. What is the collections between map and collection?
    they are all usefull for different purposes. As i mentioned before set is all about uniquess,
    List is all about duplication and efficiency(indexing). map is all about key value pairs.

    3. What is the type of map and difference between them?
    HashMap-> random
    LinkedHashMap: insertion order
    TreeMap: ascending order
    Showoff: Do you know sir that map is the combination of List and Set--->
    the key part of the Map is referring to Set:
    the value part of the Map is referring to List.


    What is the difference between Hashmap and Hashtable?
    HashTable is synchronized.
    HashTable is slower

    HashMap is non-synchronized
    HashMap is faster

     */
    public static void main(String[] args) {
        String [] fruits={"Apple","Banana","Peach","Orange","Strawberry","Banana","Apple","Cherry","Orange"};
        HashMap<String,Integer> map= new HashMap<>();
        for(int i=0; i< fruits.length; i++){
            if(!map.containsKey(fruits[i])){
                map.put(fruits[i],1);
            }else{
                map.put(fruits[i],map.get(fruits[i])+1);
            }
        }
        System.out.println(map);

        // I want you get the numbers of fruits with a key and value
        //output: Apple=3, Banana=2,....


        // //HOMEWORK: String = "HELLO WORLD HOW IS IT GOING I AM
        //    //OUTPUT: A=2345;B=4857485;d=479864;
        //    // I WANT YOU GET EACH OF THE LETTER AND HOW MANY WITH THE MAP FORM
        //    //CODING BAT
    }
}
