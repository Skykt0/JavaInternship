package Loops;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month name: ");
        String month = sc.nextLine();

        switch(month){
            case "january": case "march": case "may": case "july": case "august": case "october": case "december":
            System.out.println(month+" has 31 days");
            break;
            
            case "april": case "june": case "september": case "november":
            System.out.println(month+ " has 30 days");
            break;

            case "febuary":
            System.out.println(month+" has 28 days");
            break;

            default:
            System.out.println("invalid entery");
        }

    }
}
