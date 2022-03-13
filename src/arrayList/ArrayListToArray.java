package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<>();
        names.add("Dima");
        names.add("Diana");
        names.add("Aizat");
        names.add("Samir");
        System.out.println(names);
        // convert this arrayList to array
        names.toArray();
        Object[] arrayName= names.toArray();
        System.out.println(Arrays.toString(arrayName));
        arrayName[arrayName.length]= "Alex";
        System.out.println(Arrays.toString(arrayName));
    }
}
