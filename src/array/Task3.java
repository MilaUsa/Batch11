package array;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        //print out numbers that are greater than 10
        int[] arr= {4,24,10,100,5,78,1,25,55};
        //System.out.println(arr[3]); //100

        int[] largeNumbers=new int[arr.length];
        for(int i=0;i< arr.length; i++){
            if(arr[i]>10) {

                largeNumbers[i]=arr[i];
               // System.out.println(arr[i]);
            }

        }
        System.out.println(Arrays.toString(largeNumbers));
        Arrays.sort(largeNumbers);
        System.out.println(Arrays.toString(largeNumbers));
    }
}
