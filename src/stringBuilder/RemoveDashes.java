package stringBuilder;

public class RemoveDashes {
    //Task: create a method that will take StringBuilder as a parameter and
    //this method will delete "dashes"(-) from it
    //
    //Interview
    //
    //I-n-te-rv-i-ew
    public static void deleteDash(StringBuilder builder){
        for(int i=0; i<builder.length();i++){
            if(builder.charAt(i)=='-'){
                builder.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(builder);

    }

    public static void main(String[] args) {
        StringBuilder strB= new StringBuilder("In-te-r-v-ie-w");
        deleteDash(strB);

    }
}
