package array;

import java.util.Arrays;

public class BiggestNumber {
    public static void main(String[] args) {
        int[] nums= {4,24,10,100,5,78,11,25,55};
        // print largest number from given array
        int biggest= nums[0];
        for(int i=1;i<nums.length; i++){
            if(nums[i]>biggest){
                biggest=nums[i];
            }
        }
        System.out.println(biggest);
        System.out.println("==========");
         Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[nums.length-1]); // largest number of the array


    }
}
