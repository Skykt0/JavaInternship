package regexprac;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class LongitudeLatitude {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String [] s = new String[1];
        for(int i=0; i<s.length; i++){
           s[i] = sc.nextLine();
        }
        // 0-180 -  "([0]|(([\\-]|[\\+])?(([1-9])|([1-9][0-9])|([1][0-7][0-9])|(180))))"
        // 0-90 - "([0]|([\\-]|[\\+])?(([1-9])|([1-8][0-9])|(90)))"
        // ,\\s - "([\\,][\\s])"
 
        String regex = "^([\\(])([0]([.][0-9]+)?|([\\-]|[\\+])?(([1-9]([.][0-9]+)?)|([1-8][0-9])([.][0-9]+)?|(90)([.][0]+)?))([\\,][\\s])([0]([.][0-9]+)?|(([\\-]|[\\+])?(([1-9])([.][0-9]+)?|([1-9][0-9])([.][0-9]+)?|([1][0-7][0-9])([.][0-9]+)?|(180)([.][0]+)?)))([\\)])$";
        Pattern p = Pattern.compile(regex);
        int i=0;
        for(String e:s){
            Matcher m = p.matcher(e);
            i++;
            if(m.matches()){
                System.out.println(e+"   mathces");
            }
            else{
                System.out.println(e+"   don't");
            }
        }
    }
}
