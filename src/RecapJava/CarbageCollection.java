package RecapJava;

public class CarbageCollection {
    /*
    1.What is garbage collector and where it is coming from?
    garbage collector  is a way of cleaning unused or useless data in the class
    int a=5; int b=6; int c=7; a=b;
    String name="Ahmet"
    String name2="Ahmet1"
    String name3="Techtorial"
    name3=name;
    name=null;

    2. How can you prove that gc is working?
    to call finalize method(protected)
    3. How can you make the object garbage?
    by assign the null value
    by reassign with the different value;--> please check the example above
    4. Can you call gc many times? (OCA)
    you can only call 1 time
     System.gc();
     5. Do you have to call gc to clean up your codes?
     No, because it works all the time automatically
     */
}
