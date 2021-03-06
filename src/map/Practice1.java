package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice1 {
    public static void main(String[] args) {
        HashMap<String, String> cityZips= new HashMap<>();
        //keySet() It returns the Set object which contains all the keys in the map.
        cityZips.put("chicago", "6001");
        cityZips.put("Des Plains", "6002");
        cityZips.put("Lake Forest", "6003");
        cityZips.put("Addison","6004");
        System.out.println(cityZips);
        System.out.println(cityZips.keySet());
        Set cityNames= cityZips.keySet();
        System.out.println(cityNames);

        //get("Addison")---> 6004
        // print out all values from the map by using keySet that we stored in the set above
       // cityZips.get("Adisson");
        for(Object name:cityNames){
            System.out.println(cityZips.get(name));
        }
       // values()
        System.out.println(cityZips.values());
       Collection values= cityZips.values();
        System.out.println(values);

        //entrySet()
        System.out.println(cityZips);
        System.out.println(cityZips.entrySet());

        Set<Map.Entry<String, String>> entries1= cityZips.entrySet();
        System.out.println(entries1);

    }
}
