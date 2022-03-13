package OOP.Abstraction.AbstractClasses;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
      //  Student student= new Student(); you can not create object from Abstract class
        Map map= new HashMap<>();
        Student student= new OnlineStudent();
        OnlineStudent student2= new OnlineStudent();


    }
}
