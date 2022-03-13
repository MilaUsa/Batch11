package String;

public class Method6 {
    public static void main(String[] args) {

        String name="   Techtorial Academy is located at tDes Plains   ";
        //trim() --> remove spaces before and after string

        String updatedName=name.trim();
        System.out.println(updatedName);
        System.out.println(name);

        //substring
       String part1= updatedName.substring(4);
        System.out.println(part1);

       String part2= updatedName.substring(4, 12);// the char at the first index is included but character/letter
        //at the second index is not included in the substring
        System.out.println(part2);

    }
}
