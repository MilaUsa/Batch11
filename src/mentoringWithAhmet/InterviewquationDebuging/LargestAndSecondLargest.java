package mentoringWithAhmet.InterviewquationDebuging;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestAndSecondLargest {
    public static void main(String[] args) {


        //find the largest and second largest with the sort method from the array.
        // Interview Question:
        int[] array = {100, 300, 200, 450, 350};
        //output
        // the largest number=450 and secondLargest=350
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(array[array.length-2]);
        System.out.println(array[array.length-1]);

        int largest= array[0];
        int secondLargest=0;
        for(int i=0; i<array.length;i++){
            if(array[i]>largest){
                secondLargest=largest;
                largest=array[i];



            }else if(array[i]>secondLargest && array[i]!=largest){
                secondLargest=array[i];
            }

        }
        System.out.println(largest + " "+secondLargest);


        }

    }
