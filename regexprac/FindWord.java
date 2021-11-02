package regexprac;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindWord {
    public static void main(String[] args) {
        // find occurance of sub-word
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of line: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Enter sentence: ");
        String[] s = new String[n];
        for(int i=0; i<n; i++){
            s[i] = sc.nextLine();
        }
        System.out.println("Enter no. of subwords:");
        int q = Integer.parseInt(sc.nextLine());
        while(q!=0){
            int count=0;
            String word = sc.next();
            String regex = "([\\w]+"+word+"[\\w]+)";
            Pattern p = Pattern.compile(regex);
            for(String e:s){
                Matcher m = p.matcher(e);
                while(m.find()){
                    count++;
                }
            }
            System.out.println(count);
            q--;
        }
    }
}
