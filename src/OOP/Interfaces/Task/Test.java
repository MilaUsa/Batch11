package OOP.Interfaces.Task;

public class Test {
    public static void main(String[] args) {
        Shape shape=new Triangle(4,5,6,8);
        System.out.println(shape.getArea());
        Triangle triangle= new Triangle(1,1,1,1);
        System.out.println(triangle.getPerimeter());

        Iscosceles isosceles= new Iscosceles(3,3,3,3);
        isosceles.getArea();// this is executed from parent which is Triangle
                           // but it wants to call getArea method from Isosceles
                           // if there is no implementation in Isosceles
        Triangle triangle1= new Iscosceles(4,4,4,4);
        triangle1.getArea();//
        Shape shape1= new Iscosceles(2,2,2,2);
        shape1.getArea();
        Shape shape2 = new Triangle(5,5,5,5);
        shape2.getArea();

        System.out.println(((Triangle)shape2).getArea());
        System.out.println(((Iscosceles)shape1).getArea());
        System.out.println(((Triangle) shape1).getArea());
        System.out.println(((Shape)triangle).getArea());



    }
}
