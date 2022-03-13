package array;

public class SumOfAll {
    public static void main(String[] args) {
        /*
         *Write a method that receive an integer array and find the even numbers total and find the
         * sum of odd numbers and difference between them
         * 1- create a method
         * 2-find the sum of even numbers
         * 3-find the sum of odd numbers
         * 4-find the difference between them
         *
         * int []array = {1,2,3,4,5,6,7,8,9,22,65,76}
         */
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 22, 65, 76};
        // i am going to use main method to run my codes.
        SumOfAll(array);
    }

    public static void SumOfAll(int[] array) {
        // how can i find the even numbers inside of the array
        int sumOfEvenNumber = 0;
        int sumOfOddNumber = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                sumOfEvenNumber += number;

            } else if (number % 2 != 0) {
                sumOfOddNumber += number;

            }

        }
        System.out.println(sumOfEvenNumber);
        System.out.println(sumOfOddNumber);
        System.out.println( sumOfEvenNumber-sumOfOddNumber);
    }
}






