package String;

public class method5 {
    public static void main(String[] args) {

        String word="Sunday";
        // relace()
        String updatedWord=word.replace('a','$');
        System.out.println(updatedWord);
       String updatedWord1= word.replace("Sun","Satur");
        System.out.println(updatedWord1);
        System.out.println(word.replace("day","*"));

        String code= "Java";
        System.out.println(code.replace('a','%'));
    }
}
