package Week4.exceptionhandling;

import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try 
        {
            try 
            {
                System.out.print("Enter numerator: ");
                int numerator = Integer.parseInt(sc.nextLine());
    
                System.out.print("Enter denominator: ");
                int denominator = Integer.parseInt(sc.nextLine());

                try 
                {
                    divide(numerator, denominator);
                } 
                catch (ArithmeticException e)
                {
                    System.out.println(e);
                }
            } 
            catch (NumberFormatException e) 
            {
                System.out.println(e);
            }

        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
        System.out.println("program ended...");
    }

    static int divide(int numerator, int denominator){
        System.out.println("answer: "+numerator/denominator);
        return numerator/denominator;
    }
}
