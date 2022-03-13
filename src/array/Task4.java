package array;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        String str="Sayora";

        int[] arr= {4,24,10,100,5,78,1,25,55,str.length()};
        //can you find sum of the numbers which are less than 10 from  given array
        int sum=0;
        for(int i=0;i < arr.length;i++){
            if(arr[i]<10) {
                sum = sum + arr[i];

                }
            }
                System.out.println(sum);

        }
    }

