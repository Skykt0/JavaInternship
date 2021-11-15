package Week4.exceptionhandling;

import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        
        try {
            validate(age);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        System.out.println("Program ended successfully..");
    }
    static void validate(int age)
    {
        if(age<18){
            throw new ArithmeticException("Not eligible for vote");
        }
        else{
            System.out.println("eligible for vote");
        }
    }
}
