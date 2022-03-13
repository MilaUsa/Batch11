package mentoringWithAhmet.InterviewquationDebuging;

import java.util.*;

public class PracticeArrayArrayListMap {
    public static void main(String[] args) {
        PracticeArrayArrayListMap object= new PracticeArrayArrayListMap();
        object.printDairy();
        object.printChips();
        object.printCookies();
        object.dairyNameAndPrice();
    }
    ////LETS DO IT STEP BY STEP:
       String[] dairy={"Milk", "Cheese", "Butter", "Yogurt", "Cream", "Casein"};
       String [] chips={ "Lays", "Fritos", "Cheetos", "Doritos", "Ruffles", "Pringles"};
       String [] cookies={"Nabisco","Oreo", "Nestle", "Amos", "SnackWell" ,"MaryLand"};
    //    //Store following dairy to the array: Milk, Cheese, Butter, Yogurt, Cream, Casein
    //    //Store following chips to the array: Lays, Fritos, Cheetos, Doritos, Ruffles, Pringles
    //    //Store following cookies to the array: Nabisco,Oreo, Nestle, Amos, SnackWell ,MaryLand
    //    //TASK 1:
     double[] dairyPrice={2.99, 1.99, 3.99, 2.49, 0.99, 1.69};
     double[] chipsPrice={3.99,  2.99,  4.99,  3.49,  1.99,  2.69};
     double[] cookiesprice={4.99,  3.99,  5.99,  4.49,  2.99,  3.69};
    //    //  Create three more arrays to store the prices for these products.
    //    //dairyPrice :  2.99, 1.99, 3.99, 2.49, 0.99, 1.69,
    //    //chipsPrice :  3.99,  2.99,  4.99,  3.49,  1.99,  2.69,
    //    //cookiesPrice: 4.99,  3.99,  5.99,  4.49,  2.99,  3.69,
    //    //TASK 2:
    public  void printDairy() {
        List<String> dairyList = new ArrayList<>();
        for (String product : dairy) {
            dairyList.add(product);
        }
        System.out.println(dairyList);
        List<String> shortWay = new ArrayList<>(Arrays.asList(dairy));
    }

    ////    Create the method to print the Dairy.(do it with the list, think about the reason why )
    ////    Create the method to print the Chips.(do it with the list, think about the reason why )
    public  void printChips() {
        List<String> dairyList = new ArrayList<>();
        for (String product : chips) {
            dairyList.add(product);
        }
        System.out.println(dairyList);
        List<String> shortWay = new ArrayList<>(Arrays.asList(chips));
    }
    ////    Create the method to print the Cookies (do it with the list, think about the reason why )
    public  void printCookies() {
        List<String> dairyList = new ArrayList<>();
        for (String product : cookies) {
            dairyList.add(product);
        }
        System.out.println(dairyList);
        List<String> shortWay = new ArrayList<>(Arrays.asList(cookies));
    }
    //    //TASK 3:
    // //    Create the method to print the DairyPrice.(do it with the list, think about the reason why )
    ////    Create the method to print the ChipsPrice.(do it with the list, think about the reason why )
    ////    Create the method to print the CookiesPrice (do it with the list, think about the reason why )
    //
    //    //TASK 4:
    public void dairyNameAndPrice(){
        Map<String, Double> map=new LinkedHashMap<>();
        for(int i=0;i<dairy.length; i++){
            map.put(dairy[i],dairyPrice[i]);
        }
        System.out.println(map);
    }
    ////    Create the method to print the DairyName and DairyPrice.(do it with the map, think about the reason why )
    //
    //
    ////    Create the method to print the ChipsName and ChipsPrice.(do it with the map, think about the reason why )
    //
    //
    ////    Create the method to print the CookiesName and CookiesPrice (do it with the map, think about the reason why )
    //
    //    //TASK 5:
    //    // Do all Task4 in a same method
    //
    //
    //    //TASK 6:
    //
    //    //Create a method with the parameter String nameofItem and find the price of the product ?
    //
    //
    //
    //    //Create a method with the parameter String nameofItem and remove it from the map
    //
    //
    //
    //    //Create a method with the parameter String nameofItem and replace it with the new product
}
