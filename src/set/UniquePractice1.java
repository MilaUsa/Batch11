package set;

import javax.print.attribute.HashPrintServiceAttributeSet;
import java.util.*;

public class UniquePractice1 {
    public static void main(String[] args) {


        String[] letters ={"a","b","c","d"};
        // store these elements in to a set
        Set<String> let= new HashSet<String>(Arrays.asList(letters));
        System.out.println(let);
        List listOfLetters= Arrays.asList(letters);
        TreeSet setofLetters = new TreeSet(listOfLetters);
        System.out.println(setofLetters);
        setofLetters.add("x");
        System.out.println(setofLetters);
        // show/ print duplicate elements
        String[] letters1 ={"a","a","b","c","d","d"};

        HashSet<String> duplicates= new HashSet<>();
        ArrayList duplicateStorage = new ArrayList();
        for(String l:letters1){
            if(!duplicates.add(l)){
                System.out.println("This is reapiting elements"+l);
                duplicateStorage.add(l);
            }

        }
        System.out.println(duplicates);
        System.out.println(duplicateStorage);

    }
}