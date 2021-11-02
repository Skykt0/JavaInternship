package regexprac;

import java.io.Console;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Email {
    public static void main(String args[]){

        Console con = System.console();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String []s = new String[n];
        if(n<=100){
            for(int i=0; i<n; i++){
                s[i]=con.readLine();
            }
        }
        //ArrayList<String> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        String regexEmail = "([a-zA-Z0-9_.]+@[a-z]+([.]?[a-zA-Z0-9_]{2,})+)";
        Pattern p = Pattern.compile(regexEmail);
        for(String e:s){
            Matcher m = p.matcher(e);
            while(m.find()){
                set.add(m.group());
            }   
        }
        ArrayList<String> list = new ArrayList<>(set);
        Collections.sort(list);
        System.out.println();
        System.out.println();
        System.out.println("email id: ");
        for(int i=0; i<list.size(); i++){
            if(i==list.size()-1)
            System.out.println(list.get(i));
            else
            System.out.println(list.get(i)+";");
        }
    }
}


/*



email id - 
Traveler@ngs.org;
apps@ngs.org;
askngs@nationalgeographic.com;
feedback@natgeotv.com;
genographic@ngs.org;
genographicespanol@ngs.org;
givinginfo@ngs.org;
jbmccorm@ngs.org;
maps@ngs.org;
mpotts@ngs.org;
newsdesk@nationalgeographic.com;
ngassignment@ngs.org;
ngsdigital@customersvc.com;
ngsforum@nationalgeographic.com;
ngsline@customersvc.com;
pressroom@ngs.org;
speakers@ngs.org;
stock@ngs.org;
topo@ngs.org

Traveler@ngs.org;
apps@ngs.org.;
askngs@nationalgeographic.com;
feedback@natgeotv.com;
genographic@ngs.org;
genographicespanol@ngs.org;
givinginfo@ngs.org;
jbmccorm@ngs.org;
maps@ngs.org;
mpotts@ngs.org;
newsdesk@nationalgeographic.com;
ngassignment@ngs.org;
ngsdigital@customersvc.com;
ngsdigital@customersvc.com;
ngsforum@nationalgeographic.com;
ngsline@customersvc.com.;
pressroom@ngs.org;
speakers@ngs.org;
stock@ngs.org;
topo@ngs.org
*/