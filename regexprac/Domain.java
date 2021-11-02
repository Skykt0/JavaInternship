package regexprac;

import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class Domain {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String s[] = new String[n];
        for(int i=0; i<n; i++){
            s[i] = sc.nextLine();
        }
        String regex = "([a-zA-Z0-9]+[.]?)+((.com)|(.in)|(.org))";        
        Pattern p = Pattern.compile(regex);
        for(String e:s){
            Matcher m = p.matcher(e);
            if(m.find()){
                if(m.group().substring(0,4).equals("www.")|m.group().substring(0,4).equals("ww2.")){
                System.out.print(m.group().substring(4,m.group().length())+";");
                }
                else{
                    System.out.print(m.group().substring(0,m.group().length())+";");
                }
            }
        }
    }
}