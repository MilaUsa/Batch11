package map;

import java.util.HashMap;

public class CountAndStore {
    public static void main(String[] args) {
        String string="Ping Pong";
       /* HashMap<String,Integer> letters= new HashMap<>();
        String c="";
        for (int i = 0; i < string.length(); i++) {
            c = string.substring(i, i + 1);
            if (!letters.containsKey(c)) {
                letters.put(c, 1);
            } else {
                letters.put(c, letters.get(c) + 1);
            }
        }
        System.out.println(letters);

        }*/
        string= string.replace("","");
        HashMap<Character,Integer> letterCount = new HashMap<>();
        for(int i=0; i<string.length(); i++){
        if(letterCount.containsKey(string.charAt(i))){
        letterCount.put(string.charAt(i),1);
        }else{
            letterCount.put(string.charAt(i),letterCount.get(string.charAt(i))+1);
        }
        }
        System.out.println(letterCount);
    }
    }

