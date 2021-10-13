package Week1.Methods;

import java.util.Scanner;
public class MyMethod {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
        // prime number 

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        boolean ans = isPrime(num);
        System.out.println(ans);
    }

    static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        int c =2;
        while(c<num){
            if(num%c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
   
}
