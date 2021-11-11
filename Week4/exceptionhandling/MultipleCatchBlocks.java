package Week4.exceptionhandling;

import java.util.Scanner;

public class MultipleCatchBlocks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.print("enter numerator: ");
            int numerator = Integer.parseInt(sc.nextLine());

            System.out.print("enter denominator: ");
            int denominator = sc.nextInt();

            int[] answer = new int[1];
            answer[1] = divide(numerator, denominator);
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        System.out.println("program completed");
    }

    static int divide(int numerator, int denominator){
        System.out.println("answer: "+numerator/denominator);
        return numerator/denominator;
    }
    
}
