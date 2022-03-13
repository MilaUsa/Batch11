package OOP.FinalPractice;

public final class TShirt extends Shirt{

   //you cant override the Final method


    @Override
    public boolean fit(char size) {
        return true;
    }
}
