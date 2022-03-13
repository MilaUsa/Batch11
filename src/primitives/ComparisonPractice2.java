package primitives;

public class ComparisonPractice2 {
    public static void main(String[] args) {
        // there is an event for kids if a child's height is 48' or more they can attend this event
        // print out his result if kid can attend or not

       double regHeight=48;
       double kidHeight=48;

       boolean canAttend = kidHeight>=regHeight;
        System.out.println("Can this child attend the event? " +canAttend);

        // if the age of child is 6 or less it will free

        int regAge = 6;
        int kidAge = 7;

        boolean isFree = kidAge <=regAge;
        System.out.println("Is the event free for child? "+isFree);



    }
}
