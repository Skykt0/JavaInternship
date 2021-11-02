package regexprac;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class AlienUserName {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String []s = new String[n];
        for(int i=0; i<n; i++){
            s[i] = sc.nextLine();
        }
        String regex = "[_\\.][0-9]+[A-Za-z]*_?";
        Pattern p = Pattern.compile(regex);
        for(String e:s){
            Matcher m = p.matcher(e);
            if(m.matches()){
                System.out.println("VALID");
            }else{
                System.out.println("INVALID");
            }
        }
    }
}