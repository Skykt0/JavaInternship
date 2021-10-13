package Week1.Strings;

import java.io.Console;
public class PalindromeString {
    public static void main(String[] args){
        Console con = System.console();
        System.out.print("Enter the string to check: ");
        String str = con.readLine();

        String str2 = "";
        for(int i=str.length()-1; i>=0; i--){
            str2 = str2 + str.charAt(i);
        }

        if(str2.equals(str)){
            System.out.println(str + " is a palindrome");
        }else{
            System.out.println(str + " is not palindrome");
        }
    }
}
