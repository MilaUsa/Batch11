package map;

import object.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentTest {
    public static void main(String[] args) {
        HashMap<String, String> student1 = new HashMap<>();
        student1.put("FirstName", "David");
        student1.put("LastName", "Pena");
        student1.put("Age", "25");
        student1.put("Gender", "M");
        student1.put("City", "Chicago");

        HashMap<String, String> student2 = new HashMap<>();
        student2.put("FirstName", "Michael");
        student2.put("LastName", "White");
        student2.put("Age", "35");
        student2.put("Gender", "M");
        student2.put("City", "Winnetka");

        HashMap<String, String> student3 = new HashMap<>();
        student3.put("FirstName", "Sarah");
        student3.put("LastName", "Star");
        student3.put("Age", "29");
        student3.put("Gender", "F");
        student3.put("City", "Chicago");

        List<HashMap<String, String>> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        System.out.println(studentList);

        HashMap<String, HashMap<String, String>> map3=new HashMap<>();

        // find all student who are living in Chicago and show their name

        for (HashMap student : studentList) {
            if (student.get("City").equals("Chicago")) {
                System.out.println(student.get("FirstName") + " is living in Chicago");
            }


        }
    }


    public void printStudentInfo(List<HashMap<String, String>> list) {
        for (HashMap student : list) {
            if (student.get("City").equals("Chicago")) {
                System.out.println(student.get(" FirstName ") + " is living in Chicago");
            }

        }
    }
}
