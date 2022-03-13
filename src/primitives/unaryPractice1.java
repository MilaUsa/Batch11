package primitives;

public class unaryPractice1 {
    public static void main(String[] args) {
       /* int studentNumber=25;
         System.out.println(studentNumber);
        studentNumber=studentNumber++;
        System.out.println(studentNumber);
        studentNumber = studentNumber++;
        System.out.println(studentNumber);
        studentNumber= ++studentNumber;
        System.out.println(studentNumber); //26*/

        int count=5;
        System.out.println(count++);  //5 shows5 increase 6;
        System.out.println(++count); //7




        int studentNumber=25;
        System.out.println(studentNumber++);// shows 25 but it is 26

        System.out.println(studentNumber); // shows 26 and it is 26
        studentNumber++;
        System.out.println(studentNumber);

        int count1=5;
        System.out.println(++count1); //increases to 6 and shows 6

        //===================================================================
        System.out.println(count1++); // shows 6 it is 7

        //============================================
        int number=8;
        System.out.println(number--); //shows 8 it is 7
        System.out.println(number); //shows 7 it is 6
        System.out.println(--number); //shows 5 it is 5

        number++;
        System.out.println(number++ + number++); //shows 13 number is 8
        System.out.println(number);


        int result= --number + --number+2- number++ *2;
        System.out.println(result); // result is 3
        System.out.println(number); // number is 7


int a=number++;
        System.out.println(a);
        System.out.println(number);


    }
}
