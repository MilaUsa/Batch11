package array;

import java.util.Arrays;

public class AhmetPractice {
    //int array[] ={3,6,8,3,2,7,9,9}
    // remove the duplicates from array ----> {3,6,8,2,7,9} expected result
    // suggestion 1: you should decide where to begin
    //2  you should ask some questions to yourself like how can i check each number
    //3 you should think about comparison? like compare the first number with all of them

    // how can i reach out of the number one by one   // loops
    // how can i compare the numbers with each other to make sure these numbers are unigue or not?
    public static void main(String[] args) {


        int array[] = {3, 6, 8, 3, 2, 7, 9, 9};
       String unique="";

        for (int i = 0; i < array.length; i++){
         boolean isUnique=true;
           for(int k=0; k<i; k++){
               if(array[i]==array[k]){
                   System.out.println(array[i]);
                   isUnique=false;

               }


               }
           if(isUnique){
               unique+=array[i]+" ";
           }
           }
        String [] uniqueNumbers = unique.split(" ");
        System.out.println(Arrays.toString(uniqueNumbers));
        }


    }

