package Week1.Loops;

import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        int length = name.length();
        for(int i=0; i<length; i++){
            System.out.print(name.charAt(i)+"  ");
        }
    }
}
