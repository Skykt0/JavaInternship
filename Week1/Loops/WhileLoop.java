package Week1.Loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Palindrome string using while loop: ");
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        int length = word.length()-1;
        int i=0;
        boolean flag = true;
        while(i<length){
            char ch1 = word.charAt(i);
            char ch2 = word.charAt(length);
            if((ch1==ch2)){
                i++;
                length--;
            }else{
                flag = false;
                break;
            }
        }
        if(flag==true){
            System.out.println("string is palindrome");
        }
        else{
            System.out.println("string is not palindrome");
        }
    }
}
