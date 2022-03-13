package loops.forLoop;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class MultiVarialesPractice {
    public static void main(String[] args) {
        for(int a=3, b=10; a<8 && b>0; a++, b--){
            System.out.println("a is >>>"+a);
            System.out.println("b is >>>"+b);
        }
        System.out.println("-----------------------------");


        int x=1;
        int y=5;
        for(   ; x<y; x++, y--) { //x ti incres ili y decris kylysh kerek
            System.out.println("Hello");
        }

        for(   ; x<10 && y>0; x++, y--){ //x ti incres ili y decris kylysh kerek
            System.out.println("Hello");
    }

        System.out.println("--------------------------");
        int k;
         for(x=1,y=5, k=9; x<10 || y>0; x++, y--,k++){
            System.out.println("Bye");
            System.out.println("k-->"+k);
             System.out.println(x * k);

             String str=k>=y ? "saturday" : "Sunday";
             System.out.println(str);
             System.out.println("$$$$$$$$$");
         }
    }


}
