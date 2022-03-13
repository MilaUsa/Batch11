package MentoringYusuf;

public class ProveImmutableString {
    // Con you prove with code that String in java is immutable?
    public static void main(String[]args){
        String s1 = "java"; // In string pool java will be created
        String s2 = s1; // s2 will not create it will just point the java

        System.out.println(s1==s2);
        // before s1 new it is immutable
        //after new string is mutable

        s1="new"; // In string pool new will de created
        System.out.println(s1==s2);
    }

}

