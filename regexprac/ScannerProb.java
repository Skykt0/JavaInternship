package regexprac;

import java.util.Scanner;

public class ScannerProb {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        String fatherName = sc.nextLine();
        System.out.println(name);
        System.out.println(age);
        System.out.println(fatherName);
    }    
}
