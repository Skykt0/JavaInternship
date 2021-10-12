package Week1.DateAPI;

import java.util.Date;
public class MyClass {
    public static void main(String[] args){

        //creating date object
        Date date = new Date();
        System.out.println(date);

        // currentTimeMillis() method returns milli seconds since 1 JAN , 1970
        long milli = System.currentTimeMillis();

        Date d = new Date(milli); 
        System.out.println(d);
        d.
    }
}
