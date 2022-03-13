package String;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Methods1 {
    public static void main(String[] args) {
        String device = " microphone";
        device.concat("is an input device");
        System.out.println(device);
        char ch=device.charAt(1);
        System.out.println(ch);
       int letterCount= device.length();// it returns a number
        System.out.println(letterCount);
        device+="is expensive";
        System.out.println(device.length());
        device=device.concat(" device");
        System.out.println(device.length());
        //take last char from this version of the string
        System.out.println(device.charAt(29));//e

        String example="hdskjfhurie sjhdfisfhj jsshdfisuhfidshf jshdiuhfuh shiudshfiuhuh jhduhdiuhfu.";
        char lastChar=example.charAt(example.length()-1);
        System.out.println(lastChar);
        String example2= " thanksgiving is over. the price of the turkey will go down. " +
                "So you can find more inexpensive purchases";
         int count=example2.length();
          char lastLetter=example2.charAt(count-1);
        System.out.println(lastLetter);
        String school= "Techtorial";
        //find the middle char from last string
        System.out.println(school.charAt(school.length()-1/2));
        System.out.println(example2.charAt(example2.length()-1/2));
        System.out.println(example.charAt(example.length()-1/2));


    }
}
