package Week4.exceptionhandling;

import java.util.Scanner;

public class CustomExceptions{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = Integer.parseInt(sc.nextLine());
        if(age>60)
        {
            throw new TooOldException("You are too old for marriage...");
        }
        else if(age<18)
        {
            throw new TooYoungException("you too young for marriage...");
        }
        else{
            System.out.println("you will get an email whenever finds your match...");
        }
    }
}

class TooYoungException extends RuntimeException
{
    TooYoungException(String s)
    {
        super(s);
    }
}

class TooOldException extends RuntimeException
{
    TooOldException(String s){
        super(s);
    }
}