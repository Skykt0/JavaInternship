package practice.practice1;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MainClass 
{
    static Scanner sc;
    static Student student;

   public static void main(String args[]){
       student = new Student();
       sc = new Scanner(System.in);
       System.out.println("Enter Details: ");
       setName();
   }
   
   private static void setName()
   {
        System.out.print("Name: ");
        String name = sc.nextLine();

        String regex = "[A-Za-z\s]+";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(name);

            if(m.matches())
            {
                student.setStudentName(name);
                setContact();
            }
            else
            {
                System.out.println("Invalid name");
                setName();
            }
    }


    private static void setContact() 
    {
        System.out.print("Contact Number: ");
        String contact = sc.nextLine();

        String regex = "[6789][0-9]{9}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(contact);
        
        if(m.matches())
        {
            student.setStudentContact(contact);
            setEmail();
        }
        else
        {
            System.out.println("Invalid Contact Number");
            setContact();
        }
        
    }

    private static void setEmail() 
    {
        System.out.print("Email: ");
        String email = sc.nextLine();

        String regex = "[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+[.][a-z]{2,3}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(email);

        if(m.matches())
        {
            student.setStudentEmail(email);
            setDob();
        }
        else{
            System.out.println("Invalid Email: ");
            setEmail();
        }
        
    }


        private static void setDob()
        {
            System.out.print("DOB:(dd-mm-yyyy): ");
            String dob = sc.nextLine();

            String regex = "(0[1-9]|[12][0-9]|[3][01])-(0[1-9]|1[012])-([1-9][0-9][0-9][0-9])";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(dob);

            if(m.matches())
            {
                student.setStudentDob(dob);
                student.setStudentAge(Processing.getAge(dob));
                setMarks();     
            }
            else{
                System.out.println("Invalid DOB: ");
                setDob();
            }
        }

        private static void setMarks() 
         {
            System.out.println("Enter marks: ");
            float[] marks = new float[5];

                for(int i=0; i<marks.length; i++)
                {
                    System.out.print("subject "+(i+1)+" = ");
                    marks[i]=sc.nextFloat();
                }
                
                student.setStudentMarks(marks);
                Processing.percentage(marks);
                checkRemarks(student.getStudentAge(), student.getStudentMarks());
        }

        private static void checkRemarks(int age, float[] marks)
        {
            if(Processing.checkAge(age)){
                if(Processing.checkMarks(marks)){
                    System.out.println();
                    System.out.println("Successful: ");
                    display();
                    System.exit(1);
                }
                else{
                    System.out.println();
                    System.out.println("Not Sucessful: ");
                    display();
                    System.exit(1);    
                }
            }
            else{
                System.out.println();
                System.out.println("Not Sucessful: ");
                display();
                System.exit(1);
            }
            
        }

        private static void display()
        {
            System.out.println("Name - "+student.getStudentName());
            System.out.println("Email - "+student.getStudentEmail());
            System.out.println("DOB - "+student.getStudentDob());
        }    
}
