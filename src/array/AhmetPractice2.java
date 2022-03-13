package array;

public class AhmetPractice2 {
    public static void main(String[] args) {
        // reverse in array
        //print out each of the word and reverse them from array
       //String example= " Hi guys how are you"
        //output: hi syug woh era uoy

        // how can i reach out of each words
        // i need to store them and store them

       /* String example= " Hi guys how are you";
        String array[]=example.split(" ");

        for(int i=0; i< array.length; i++) {
            String reverse = "";
            for (int k = array[i].length() - 1; k >= 0; k--) {
                reverse += array[i].charAt(k);
            }

            System.out.println(reverse);
        }*/

            String user="Hi guys how are you?";
           String[] userArr = user.split(" ");
           for(String word: userArr){
         for(int i=word.length()-1; i>=0; i--){
        System.out.print(word.charAt(i));


    }
    System.out.println();
}
    }
}
