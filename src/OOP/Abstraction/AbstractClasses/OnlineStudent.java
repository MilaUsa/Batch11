package OOP.Abstraction.AbstractClasses;

public class OnlineStudent extends Student {
    public void attend(){
        System.out.println("ONline students is attending via zoom");
    }
    public void watch(){
        System.out.println("Online Student is eating");
    }
    public OnlineStudent(){
        super("Mary",25);
    }
}
