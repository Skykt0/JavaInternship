package Week1.Methods;

import java.util.Scanner;

public class Recursion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        
        int ans = fibo(num);
        System.out.println(ans);
    }
    static int fibo(int num){
        if(num<=1){
            return num;
        }
        return fibo(num-2)+fibo(num-1);
    }
}
