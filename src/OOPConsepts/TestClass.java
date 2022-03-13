package OOPConsepts;

public class TestClass {
    /*
    1.What do you know about inheritance and how do you inherit two classes?
    Inheritance is a way to make a connections(relationship) between classes.
    2.Why do you need inheritance in your Framework?
    We need inheritance because of reducing the execution time by reducing(minimizing) the amount of code
    which makes your application more safe
    3. Why do you need Inheritance?
    -your application will be more safe
    -your framework will not have duplicated data.(Efficiency)


    ENCAPSULATION:
    1. What is an encapsulation?
    -Is a way to make your data not accessible and manipulable by everyone
    -is a way of restriction the data from the users or classes
    -Limiting the users, classes to access your data
    -it is hiding the data from users or classes
    2. Why do you use encapsulation?
    3.How can you access the data from encapsulation?
    getters and setters.
    3. if encapsulation is hiding the data from users and with getter and setters
    they can still access it? Then what is the point of it?
    because we want to limit the users or classes with the conditions(format)
    that we want to have.

    Polymorphism:
    1. What is polymorphism?
    -is a different form of the object- methods.
    2. What is dynamic and static polymorphism?
    Dynamic pol Run Time Overriding
    Static pol Compile Time overloading.
    3.What is overloading and overriding?
   - overloading: must have different method signature-> public void overloading(int a)
    - can have final, static, private                    public void overloading(int a, Sttring b)
    -should be in same class

     - Overriding must have same name and same method signature WITH DIFFERENT IMPLEMENTATION
      public void overriding(int num) {
      }
      @Overriding
      public void overriding(int num)
     - overriding methods can be static, private and final
     - should be in different classes

     Abstract classes:
    1 What is Abstract?
    2. Why do you need to have abstract class in your framework?
    For many methods, we need to developers to make their own implementation in our company, so
    they create abstract class with abstract-normal methods to
    make people find the necessary data in a short amount of time.
    @. Where do you use it in your framework
    1 Abstract is a way to organize the method with only necessary information(
 We do not have a body for abstract methods because every class which extendet to
 the abstract class can MAKE THEIR OWN IMPLEMENTATION by overriding.

2. Why do you need to have abstract class in your framework?
Almost every part of my OOP concept.


Interface:
1. What is interface?
 Interface is a blueprint of the object like a class which has a special methods that can be
 overridden to make new implementation.
2. Why do you need interface if you have abstract class?
Because interface have more features in terms of accessing the more parents by overriding their methods
3.What is the difference between interface and abstract?

1. Abstract class is declared with Abstract keyword
2. Abstract class can have abstract and non-abstract methods
3. to make a connection with Abstract class  we need to use ExTEND keyword
4. in abstract class you can Extend the classes only once.
5. you can have any variables.
6. you can have public,  protected except public

Interface:
1 In class is declared with interface keyword
2 in class can have only abstract
3 to make a connection with interface class we need to use implement key word
4. in int class you can extend once and also implement multiple classes(Parents)
5. your variable final static as default.
6. methods must be public abstract


Exceptions:
1.How do you handle the Exception?
I can handle the exceptions with try and catch blocks
2. Can you use more than catch block
yes
3. What do you know about final, finally, finalize?
Final key word to make the variables or methods unchangeable.
Finally: is a block that comes after try and catch to show final execution(statement)
Finalize(): is a method which works with GC to make sure it is manually worked. (System.gc)
4. trow and trows?

     */
    public static void main(String[] args) {
        Academician academician= new Academician();
        academician.name="Ahmet";
        academician.classes="Biology";
        academician.teaching();
        System.out.println( academician.name);
        System.out.println(academician.classes);
        Teachers teachers=new Teachers();
        System.out.println(teachers.getEmail());
        teachers.setEmail("ahmat@yahoo.com");
        System.out.println(teachers.getEmail());
        teachers.setEmail("dfsgahsdghjd@gmail.com");
        System.out.println(teachers.getEmail());


    }
}
