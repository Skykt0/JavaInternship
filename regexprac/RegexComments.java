package regexprac;
import java.io.Console;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexComments {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        Console con = System.console();
        int n = sc.nextInt();
        String[] s = new String[n];
        for(int i=0; i<n; i++){
            s[i] = con.readLine();
        }
        
        // String regexSingle ="([/][/].*)"; 
        // String regexMulti = "[/][\\*].*[\\*][/]";
        String regex = "(//.*)|[/][\\*][\\s\\S]*[\\*][/]";
        Pattern p = Pattern.compile(regex);
        //Pattern p1 = Pattern.compile(regexMulti);
        for(String e:s){
            Matcher m = p.matcher(e);
          //  Matcher m1 = p1.matcher(e);
            while(m.find()){
                System.out.println(m.group());
            }
        }
    }
}
