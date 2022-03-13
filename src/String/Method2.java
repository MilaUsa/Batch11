package String;

public class Method2 {
    public static void main(String[] args) {
        String flower="Rose";
       int indexOf1=flower.indexOf('R');
       int indexOf2= flower.indexOf("R");
        System.out.println("first implementation " +indexOf1);
        System.out.println("second implementation "+indexOf2);
        System.out.println(flower.indexOf("o"));//1
        System.out.println(flower.indexOf("os"));//1
        System.out.println(flower.indexOf("o,s"));// it doesn't find matching char/char sequence
                                                  //it will return -1
        System.out.println(flower.indexOf("Rose"));//0
        System.out.println(flower.indexOf("rose"));// no matching -1

        String object ="umbrellam";
        System.out.println(object.indexOf("e",6)); //----. -1
        System.out.println(object.indexOf('l')); //5
        System.out.println(object.indexOf('l',6));
        System.out.println(object.indexOf('m',object.indexOf('m')+1));
        System.out.println(object.indexOf('r',5));

        String sentence ="I love lilies";
        System.out.println(sentence.indexOf('l',sentence.indexOf('i')));

        // toUppercase()---> makes you string as Uppercase
        System.out.println(sentence.toUpperCase());
        System.out.println(sentence);
        System.out.println(sentence.toLowerCase());
        System.out.println(sentence.toUpperCase());
        // think about making single letter uppercase from a string
        String str="just do it";

        //indexOf()---> returning number
        //char()----> returning char
       char letter=str.charAt(str.indexOf("d"));
       String str2="";
       str2+=letter;
        System.out.println(str2.toUpperCase());

        System.out.println();


    }
}
