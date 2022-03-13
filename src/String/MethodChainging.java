package String;

public class MethodChainging {
    public static void main(String[] args) {
        String name="           David  ";
        char a= name.substring(5).substring(2).toUpperCase().
                replace("A","xxxx").trim().charAt(1);
        System.out.println(a);
    }
}
