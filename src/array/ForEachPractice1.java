package array;


public class ForEachPractice1 {
    public static void main(String[] args) {
        double[] checks={2540,10000,100000,65.50,1.99};
        double total=0;
        //by using for each loop, find and print out the total amount of checks
        for(double check:checks){
            total+=check;

        }System.out.println(total);

    }
}
