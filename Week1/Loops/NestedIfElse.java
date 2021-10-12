package Week1.Loops;

import java.util.Scanner;

public class NestedIfElse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //  to check whether you are eligible for NDA exam or not

        System.out.print("Enter you name: ");
        String name = sc.nextLine();

        System.out.print("Enter your gender: ");
        String gender = sc.nextLine();
        
        System.out.print("Enter your Stream:");
        String stream = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        

        if(age>=18 && age<23){
            if(stream.equals("math")){
                if(gender.equals("male")){
                    System.out.println("You are eligible for the NDA exams");
                }else{
                    System.out.println("You are not eligible for the NDA exams, females are not allowed for NDA");
                }
            }else{
                System.out.println("You are not eligible for the NDA exams, the stream should be maths");
            }
        }else{
            System.out.println("You are not eligible for NDA exams yet, age should be between 18 and 23");
        }

    }
}
