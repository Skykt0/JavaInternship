package regexprac;
import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class HtmlLinks {

    public static void main(String[] args) {
        Console con = System.console();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(con.readLine());
        String[] s = new String[n];
        if(n<100){
           for(int i=0; i<n; i++){
               s[i] = con.readLine();
           }
        }
        String regexLink = "(href)[=][\"][\\w.:_=?&/\\-]*[\"]";
        Pattern p = Pattern.compile(regexLink);
        for(String e:s)
        {
            Matcher m = p.matcher(e);
            while(m.find())
            {
                String tempLink = m.group();
                System.out.println(tempLink.substring(6,tempLink.length()-1));
            }
        }
    }
}

/*
    abstract <!-- preload scripts required on the same page -->
  <link rel="preload" as="script" href="https://hrcdn.net/community-frontend/assets/hackerrank_r_vendor-2bc7c1b2f5.js">
  <link rel="preload" as="script" href="https://hrcdn.net/community-frontend/assets/hackerrank_r_client-2679d5c3.js">
  <link rel="preload" as="script" href="https://hrcdn.net/community-frontend/assets/runtime-fe8b36c1.js">
  <link rel="preload" as="script" href="https://hrcdn.net/community-frontend/assets/chunks_runtime-48d517d5c8.js">

  */