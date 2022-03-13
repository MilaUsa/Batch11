package MentoringYusuf;

import java.util.Random;

public class ShuffleArray {
    public static int[] shuffle(int[] array ){
        Random random = new Random();
// [5,3,4] 3
        for (int i = 0; i <array.length ; i++) {
            int randomIndex = random.nextInt(array.length);
            int temp = array[randomIndex];
            array[randomIndex] =array[i];
            array[i] =temp;


        }


        return array;


    }
}
