package mentoringWithAhmet.InterviewquationDebuging;

public class Quastion1 {

    //1-Create a method which accepts number1 and number parameters(int)
    // 2-Get the sum of two digits and return true(if it matching) or false(if it is not matching)
    // Example positive Scenario : num1=45767
    //          num2=12
    //    Output=True;
    //Example Negative Scenario:  num1=54342
    //                            num2=21
    // Output=False;

    //first of all i need to reach out eacj of the number1
    //i need to add them and then compare with number2
    public static void main(String[] args) {
        int num1=45767;
        int num2=12;
        System.out.println(Results(num1,num2));
    }


    public static boolean Results(int num1, int num2){
        String [] numbers=(""+num1).split("");
        int[] nums=new int[numbers.length];
        for(int i=0; i<numbers.length; i++){
            nums[i]=Integer.parseInt(numbers[i]);
        }
            for(int j=0; j<nums.length; j++){
                for(int k=j+1; k<nums.length;k++){
                    if(nums[j]+nums[k]==num2){
                        return true;
                    }
                }
            }

        return false;
    }
}
