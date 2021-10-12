package Week1.Array;

import java.util.Scanner;
public class MyClass{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        //anonymous array - passed as an argument of method
        float percentage = calculatePercentage(new float[]{70,77,87,68,81});
        System.out.println("obtained percentage is: "+percentage);

    }
    static float calculatePercentage(float []marks){
        float ans=0;
        for(int i=0; i<marks.length; i++){
            ans = ans+marks[i];
        }
        return ans/marks.length;
    }
}