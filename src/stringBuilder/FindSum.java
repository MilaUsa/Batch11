package stringBuilder;

public class FindSum {
    public static void main(String[] args) {
        //create a method to find sum of digits from a StringBuilder parameter
        //StringBuilder -> numbers= "turs4o_9_i_2";
        StringBuilder stringBuilder= new StringBuilder("turs4o_9_i_2");
        sumOfDigit(stringBuilder);
    }

    public static void sumOfDigit(StringBuilder numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length(); i++) {
            if (Character.isDigit(numbers.charAt(i))) {
               // String str = "" + numbers.charAt(i);
               // double num = Double.parseDouble(str);
               // sum += num;
                sum+=Double.parseDouble(""+numbers.charAt(i));
            }
        }
        System.out.println(sum);
    }

}
