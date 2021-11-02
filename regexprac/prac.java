package regexprac;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class prac {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String regex = "[0]([.][0-9]+)?";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        if(m.matches())
        System.out.println("matched");
        else
        System.out.println("don;t");
    }
}
