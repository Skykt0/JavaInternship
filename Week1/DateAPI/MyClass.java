package Week1.DateAPI;

import java.util.Date;
public class MyClass {
    public static void main(String[] args){

        Date date = new Date();
        System.out.println(date);

        long milli = System.currentTimeMillis();
        Date d = new Date(milli);
        System.out.println(d);
    }
}
