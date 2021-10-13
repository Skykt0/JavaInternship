package Week1.Strings;

public class FirstString {
    public static void main(String args[]){
        // creation of string object

        //by string literals
        String s1 = "Akash"; // first jvm will check string pool if it already exists or not
        String s2 = "Akash"; // already exists in string pool so will not create new object instead will point to exist object

        //by using new keyword
        String s3 = new String("Akash Tanwar"); // will create new object outside string pool but in heap memory
        String s4 = new String("Akash Tanwar"); // will create new object 

        /* 
            ==, it checks that references are pointing to same object or not*
            equals(), checks the value of the object
        */
        
        System.out.println(s1==s2); // true
        System.out.println(s1.equals(s2)); // true

        System.out.println(s3==s4); // false
        System.out.println(s3.equals(s4));  // true   

        // compareTo()
        String str1 = "a";
        String str2 = "b";
        String str3 = "z";

        System.out.println(str1.compareTo(str2)); 
        System.out.println(str2.compareTo(str1)); 
        System.out.println(str1.compareTo(str3)); 

    }
}
