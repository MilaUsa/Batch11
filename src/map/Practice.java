package map;


import java.util.HashMap;

public class Practice {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Enes");
        map.put(2,"Alex");
        map.put(3,"David");
        map.put(4,"Alex");
        System.out.println(map);
        map.put(1,"Yusuf"); // is not coming because key doesn't repeat,
        // if you try to store some key multiple times,
        //
        System.out.println(map);
        map.put(null,"Enes");
        System.out.println(map);

        // put()
        System.out.println(map.get(2));// it will get the value for key 2
        System.out.println(map.get(3));
        System.out.println(map.get(null));

        //remove()
        map.remove(null);
        System.out.println(map);

        System.out.println(map.remove(1,"Yusuf"));

        //replace();
        map.replace(2,"Jenniffer");
        System.out.println(map);
        map.replace(2,"Jenniffer","Zack");
        System.out.println(map);
        System.out.println(map.containsKey("Zack"));
        System.out.println(map.containsKey(6));
        System.out.println(map.containsKey(19));
        System.out.println(map.containsValue("Enes"));
        System.out.println(map.containsValue(false));

        //size()
        System.out.println(map.size());
        System.out.println(map.isEmpty());

        //putAll()
        HashMap<Integer, String> map1= new HashMap<>();
        map1.put(1,"White");
        System.out.println(map1);
        map1.putAll(map);
        System.out.println(map1);
        map1.put(9,"Brain");
        System.out.println(map1);




    }
}
