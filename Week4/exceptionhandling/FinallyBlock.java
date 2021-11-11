package Week4.exceptionhandling;

import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("enter numerator: ");
            int numerator = Integer.parseInt(sc.nextLine());

            System.out.print("enter denominator: ");
            int denominator = sc.nextInt();

            divide(numerator, denominator);

        } catch (NullPointerException e) {
            System.out.println(e);
        }
        finally{
            System.out.println("Always executes whether exception handled or not");
        }
    }

    static int divide(int numerator, int denominator){
        System.out.println("answer: "+numerator/denominator);
        return numerator/denominator;
    }
}
