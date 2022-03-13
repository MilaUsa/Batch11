package array;

import java.util.Arrays;

public class MultiPractice1 {
    public static void main(String[] args) {
        // states of different regions in US
        //String[][]states1=new String[][];
        // print out every single sate
        String[][] states={{"IL","OH"},{"NY","FL","NC"},{"CA","WA","OR","UT"}};
        for(int a=0;a< states.length;a++){
            for(int b=0;b<states[a].length; b++){
                System.out.println(states[a][b]);
            }
        }
        System.out.println(Arrays.deepToString(states));
        //with for each loop
       // for(String[] state:states){
          //  for(String st:state){
            //    System.out.println(st);
           // }
       // }
    }
}
