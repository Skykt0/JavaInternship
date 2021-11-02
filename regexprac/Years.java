package regexprac;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Years {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String regex = "((0[1-9])|([12][0-9])|([3][01]))[\\-]((0[1-9])|[1][012])[\\-]((201[6-9])|(202[0]))";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        if(m.matches()){
            System.out.println("regex matched");
        }
        else{
            System.out.println("regex not matched");
        }
    }
}
