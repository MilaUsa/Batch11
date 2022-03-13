package primitives;

public class TruthTable {
    public static void main(String[] args) {
        //visa and ticket

        boolean visa = true;
        boolean ticket = true;

        boolean myVisa = false;
        boolean myTicket = true;

        boolean  canTravel = visa == myVisa && ticket == myTicket;


        System.out.println(canTravel);

        // ask question

        boolean online = true;
        boolean campus = true;
        boolean student = true;
       boolean result= student == online || student == campus;
        System.out.println("can I ask question? " +result);



        // 90% or more attendance and score of 80 or more to pass this class
        int attendance=90;
        int score=80;
        int yourAttendance=100;
        int yourScore=90;
       boolean pass= yourAttendance>= attendance && yourScore >=score;
        System.out.println("can I pass the course?>> " +pass);


    }
}
