package EmployeeProject;

public class EmpDriver {
    public static void main(String[] args) {
     Employee employee1= new Employee("Ahmet",2000, 45,12);
     employee1.information(employee1);
     Employee empl2= new Employee("a",12,34,45);
     empl2.information(empl2);
    }
}
