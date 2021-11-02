package regexprac;

import java.util.Scanner;
import java.util.regex.Pattern;

public class IpAddress {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        //ipv4 - (0-255).(0-255).(0-255).(0-255)
        //ipv6 - (0-9a-f):(0-9a-f):(0-9a-f):(0-9a-f):(0-9a-f):(0-9a-f):(0-9a-f):(0-9a-f)
        String ipv4 = "(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])[.]){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
        String ipv6 = "[0-9a-f]{1,4}[:][0-9a-f]{1,4}[:][0-9a-f]{1,4}[:][0-9a-f]{1,4}[:][0-9a-f]{1,4}[:][0-9a-f]{1,4}[:][0-9a-f]{1,4}[:][0-9a-f]{1,4}";
        String []s=new String[n];
        if(n<=50)
        {
            for(int i=0; i<n; i++)
            {
                s[i] = sc.nextLine();
            }
        }

        for(String e:s)
            {   
                if(Pattern.matches(ipv4,e))
                System.out.println("IPv4");
                else if(Pattern.matches(ipv6,e))
                System.out.println("IPv6");
                else
                System.out.println("Neither");
            }
    }
}

/*

1050:1000:1000:a000:5:600:300c:326b
1050:1000:2000:ab00:5:600:300c:326a
1050:1000:3000:abc0:5:600:300c:326c
1051:1000:4000:abcd:5:600:300c:326b
22.231.113.64
22.231.113.164
222.231.113.64

This line has junk text.
121.18.19.20
2001:0db8:0:0:0:ff00:0042:8329

*/