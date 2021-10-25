package practice.practice1;

import java.util.ArrayList;
import java.util.regex.Pattern;

class RegexChecker{

    static ArrayList<Boolean> details = new ArrayList<>();

    static void checkRegexName(String name)
    {
        String regexName = "[A-Za-z\s]+";

        if(Pattern.matches(regexName, name))
        {
            details.add(true);
            MainClass.student.setStudentName(name);
        }
        else
        {
            details.add(false);
        }
    }

    static void checkRegexContact(String contact)
    {
        String regexContact = "[6789][0-9]{9}";

        if(Pattern.matches(regexContact, contact))
        {
           details.add(true);
           MainClass.student.setStudentContact(contact);
        }
        else
        {
           details.add(false);
        }    
    }

    static void checkRegexEmail(String email)
    {
        String regexEmail = "[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-z]+[.][o|r|g|i|n|c|m]{2,3}";

        if(Pattern.matches(regexEmail, email))
        {
            details.add(true);
            MainClass.student.setStudentEmail(email);
        }
        else
        {
            details.add(false);
        }    
    }

    static void checkRegexDob(String dob)
    {
        String regexDob = "(0[1-9]|[12][0-9]|[3][01])-(0[1-9]|1[012])-([1-9][0-9][0-9][0-9])";
        // 05-05-2001
        // 09-12-9999
       if(Pattern.matches(regexDob, dob))
       {
           details.add(true);
           MainClass.student.setStudentAge(Processing.getAge(dob));
           MainClass.student.setStudentDob(dob);
       }
       else
       {
           details.add(false);
       }
    }

    static void checkUserDetails()
    {
        for(int i=0; i<details.size(); i++){
            if(i==0 && details.get(i) == false){
                System.out.print("Name, ");
            }
            if(i==1 && details.get(i) == false){
                System.out.print("Contact Number, ");
            }
            if(i==2 && details.get(i) == false){
                System.out.print("Email, ");
            }
            if(i==3 && details.get(i) == false){
                System.out.print("Date of Birth ");
            }
        }
    }

}
