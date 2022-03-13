package object;

public class TestOverload {
    public static void main(String[] args) {
        OverloadPractice obj=new OverloadPractice();
        obj.sum("String example",
                4, 5);
        obj.sum(new int[]{1,2,3});
        obj.sum(8,9);

        Cat cat = new Cat();
        cat.run();

    }
}
