package regexprac;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sentence {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String regex = "([A-Z][a-z\s]+)([a-z\\s]+){4}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        if(m.matches())
        System.out.println("matched");
        else
        System.out.println("not matched");
    }
}
