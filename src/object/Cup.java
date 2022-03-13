package object;

public class Cup {
    int size;
    String color;
    boolean isclean;
    public Cup(int size){
        this.size=size;
    }
    public Cup(String color){
        this.color=color;
    }

    public Cup(int size, String color, boolean isclean) {
        this.size = size;
        this.color = color;
        this.isclean = isclean;
    }
    public void usage(){
        isclean=false;
        System.out.println("cup is not clean anymore"+isclean);
    }


    @Override
    protected void finalize()  {
        System.out.println();
    }

    public static void main(String[] args) {
        Cup c1=new Cup(12,"red", true);
        Cup c2=new Cup(12,"red", true);
        Cup c3=new Cup(12,"red", true);
        Cup c4=new Cup(12,"red", true);
        System.out.println(c4.isclean);
        c4.usage();
        Cup c5=c1;
        c1=c4;
        System.out.println(c1.isclean);
        System.out.println(c5.isclean);
        System.out.println(c1.toString()); // hashcode
        c2=null;
        c5=c2;

        System.out.println(c2); //hashcode
        c2=c3;
        System.out.println(c2.isclean);
       // System.out.println(c5.color);//NullPointerException
        c1=null;

        System.gc();
    }
}
