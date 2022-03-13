package loops.forLoop;

public class MultiplicationTable {
    public static void main(String[] args) {

        for(int mul=1;mul<=5;mul++) {
            for (int k = 1; k <=10; k++) {
                System.out.println(mul+ "*" + k + "="+mul*k);
            }
        }
    }
}
