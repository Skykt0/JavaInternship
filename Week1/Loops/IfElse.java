package Loops;

import java.util.Scanner;
public class IfElse {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word to check whether it is palindrome or not");
        String word = sc.nextLine();

        StringBuffer s1 = new StringBuffer(word);
        String s2 = s1.reverse().toString();

        if(s2.equals(word)){
            System.out.println(word + " is a palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
