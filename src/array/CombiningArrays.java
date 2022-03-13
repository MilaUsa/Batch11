package array;

import java.util.Arrays;

public class CombiningArrays {
    public static void main(String[] args) {
        int[] num1 = {3, 4, 5};
        int[] num2 = {6, 7, 8, 9};
        // combine these two arrays in to another array
        int[] result = new int[num1.length + num2.length];
        for (int i = 0; i < num1.length; i++) {

            result[i] = num1[i];
        }
        System.out.println(Arrays.toString(result));

     for(int b=num1.length,c=0;b<result.length; b++,c++){
         result[b]=num2[c];
     }
        System.out.println(Arrays.toString(result));
    }
}
