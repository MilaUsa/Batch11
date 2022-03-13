package loops.While_DoWhile;

public class PhoneCallTask {
    public static void main(String[] args) {
        // -you $40 in your international phone calling account
        //  -if every call you make costs $5
        //  -find out and print: how many total calls you can make with your balance of $40
        //    ex. print out --> "you can make <...> calls with your balance"
        int intCall=40;
        int callCost=5;
        int count=0;
        while(intCall>0){
            intCall-=callCost;
            count++;
            System.out.println("your balance now:" +intCall);
            int calls=intCall/callCost;
            System.out.println(calls);
            System.out.println("you can make"+calls+ "more calls with your remaining balance of" +intCall);
           // System.out.println("you can make"+ count+ "calls with your" +intCall);// 8 katardy korsotot
        }
        System.out.println("you can make "+ count+ " calls with your " +intCall);
    }
}
