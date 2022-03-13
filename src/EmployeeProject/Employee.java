package EmployeeProject;

import java.time.LocalDate;

public class Employee {
    // instance data(variable): is a variable that belongs to the class.
    // (It is a way initialize your object features
    String name;
    double salary;
    int workHours;
    int hireYear;

    //constructor: Constructor is a way of initializing the instance variables

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double Tax(){
        if(salary<=1000){
            return 0.0;
        }else{
            return salary*0.03;
        }
    }
    public double Bonus(){
        //the logic:
        int extraHours=workHours-40;
        if(extraHours>0){
            return extraHours*30;
        }else{
            return 0.0;
        }
    } public double RaiseSalary(){
        LocalDate now= LocalDate.now();
        int year=now.getYear()-hireYear;
        //int year =2015-hireYear;
        if(year<10){
            return salary*0.05;
        }else if(year>=9 && year<20){
            return salary*0.01;
        }else{
            return salary*0.05;
        }
    }
   public void information(Employee employee1){
       System.out.println("Name"+name);
       System.out.println("Salary"+this.salary);
       System.out.println("Work hours"+workHours);
       System.out.println("Hire year"+hireYear);
       System.out.println("Tax:"+ employee1.Tax());
       System.out.println("Bonus"+Bonus());
       System.out.println("Increase of Salary"+RaiseSalary());
       System.out.println("Salary with Tax and Bonus"+ (salary- employee1.Tax()+Bonus()));
       System.out.println("Total salary with the Raise of salary"+(salary+RaiseSalary()));
   }

}
