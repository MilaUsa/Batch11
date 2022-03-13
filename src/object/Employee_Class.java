package object;

public class Employee_Class {

    //method: to update company budget
    //`instance fields: --> id, name, budgetOfCompany, companyName
    //`constractors: --> no args, one arg, multiple

        int id;
        String name;
        double budgetOfCompany;
        String companyName;

        public void updateCompanyBudget(double expensess){
            System.out.println("The budget of company"+budgetOfCompany);


    }
        public Employee_Class(){
            System.out.println("");

        }
             public Employee_Class(int newId){
               this.id=newId;
        }
         public Employee_Class(String newName,int id ){
           this.name=newName;
           this.id=id;
        }
         public Employee_Class(String name, int id, String companyName){

    }
    public double getBudgetOfCompany(){
            return budgetOfCompany;
    }
    public void setBudgetOfCompany(double budgetOfCompany){
        this.budgetOfCompany=budgetOfCompany;
    }

    public static void main(String[] args) {
        Employee_Class e1= new Employee_Class(34);
        e1.updateCompanyBudget(500);
        e1.budgetOfCompany=20000;
        System.out.println(e1.getBudgetOfCompany());

        Employee_Class e2= new Employee_Class(45);
        // if you want to create an object with no argument constructor?? if there is no
        //argument constractor in the class
        // you can not create an object by using 'default' java constructor.
        // because it will be gone 
        }
        }


