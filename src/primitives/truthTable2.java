package primitives;

public class truthTable2 {
    public static void main(String[] args) {

        //there is an event for kids
        // if the age of child is 6 or less or if the height of child is 48 inches or less
        // the event is free for that child

        int regAge=6;
        double regHeight=48;
        int childAge=7;
        double childHeight=47;
       boolean freeEvent= regAge>=childAge || regHeight>=childHeight;

        System.out.println("Is the event free? " +freeEvent);

        //find out if student can pass class
        // there are 3 test taken----> 60,100,85
        // average of those test has to be 70 or more
        // attendance rate of the student has to be 80% OR MORE
        // print taut if student can pass or not
        
        int testAverage=70;
        int attendanceRate=80;
        int studentAttendance=85;
        int test1=90;
        int test2=0;
        int test3=100;
        int average=(test1+test2+test3)/3;
        boolean canPass = average>=testAverage && studentAttendance>=attendanceRate;
        System.out.println(average);
        System.out.println("Can student pass? " +canPass);


    }
}
