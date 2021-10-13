package Week1.Strings;

import java.util.Arrays;

public class SecondString {
    public static void main(String[] args){
       // String methods

       // charAt(), length()
       String str = "Java Internship";
       for(int i=0; i<str.length(); i++){
           System.out.print(str.charAt(i)+" ");
       }

       // substring()
       System.out.println(str.substring(4));
       System.out.println(str.substring(0,10));

       //replace()
       System.out.println(str.replace("Java","Python"));
       System.out.println(str.replaceAll("a", "o"));

       //split()
       System.out.println(Arrays.toString(str.split(" ")));
       
       //valueOf()
       System.out.println(String.valueOf(12));
    }
}
