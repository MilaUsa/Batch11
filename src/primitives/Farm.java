package primitives;

public class Farm {
    public static void main(String[] args) {
        /* in a farm, there are 12 cows and 23 chickens
        1-find the total legs of the animals in the farm and print out
        2- if each cow costs $2345 and each chicken costs $23.99
        find the total worth of these animals and print out
         */
        int cows=12;
        int chickens=23;
         int chickenLegs=2;
         int cowsLegs=4;

                int  legs=(cows*cowsLegs)+(chickens*chickenLegs);
        System.out.println("Total legs are" +legs);

        float cow=2345f;
        float chicken=23.99f;
        float tWorth=(cows*cow)+(chickens*chicken);
        System.out.println("Total worth are" +tWorth);





    }
}
