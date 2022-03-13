package OOP.Abstraction.AbstractClasses;

public class SelfLearnerStudents extends Student {
    public void attend(){
        System.out.println("Self learner is attending");
    }
    public void watch(){
        System.out.println("self learner is watching");
    }
    public void sleep(){
        System.out.println("self learner is sleeping");
    }
    public SelfLearnerStudents(){
        super("Halicha",22);
    }

}
