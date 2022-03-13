package RecapJava;

public class GroceryStore {
    int numberOfSoldApples;
    double priceOfEachApple;
    int numberOfSoldOranges;
    double priceOfEachOrange;

    public GroceryStore(int numberOfSoldApples, double priceOfEachApple, int numberOfSoldOranges, double priceOfEachOrange) {
        this.numberOfSoldApples = numberOfSoldApples;
        this.priceOfEachApple = priceOfEachApple;
        this.numberOfSoldOranges = numberOfSoldOranges;
        this.priceOfEachOrange = priceOfEachOrange;
    }
    public GroceryStore(){}

    public int getNumberOfSoldApples() {
        return numberOfSoldApples;
    }

    public double getPriceOfEachApple() {
        return priceOfEachApple;
    }

    public int getNumberOfSoldOranges() {
        return numberOfSoldOranges;
    }

    public double getPriceOfEachOrange() {
        return priceOfEachOrange;
    }

    public void grossRevenue(String city) {
        double sum = (getNumberOfSoldApples() * getPriceOfEachApple() *
                getNumberOfSoldOranges() * getPriceOfEachOrange());
        System.out.println("The revenue of the"+city+"is"+sum);
    }




}
