package practice.practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MainClass 
{
    static Scanner sc;
    static Student student;
    static ArrayList<Boolean> details;

   public static void main(String args[]){
    student = new Student();
    sc = new Scanner(System.in);
    details = new ArrayList<>();

    read(); // taking input from the user
    checkRemarks(student.getStudentAge(), student.getStudentMarks());
    display();
   }

   private static void read()
   {
       System.out.println("Enter details: ");

       // student name input
       System.out.print("Name: ");
       String name = sc.nextLine();
       String regexName = "[A-Za-z\s]+";

       if(Pattern.matches(regexName, name)){
           details.add(true);
       }else{
           details.add(false);
       }
       student.setStudentName(name);

       // student contact input
       System.out.print("Contact Number: ");
       String contact = sc.nextLine();
       String regexContact = "[6789][0-9]{9}";

       if(Pattern.matches(regexContact, contact)){
           details.add(true);
       }else{
           details.add(false);
       }    
       student.setStudentContact(contact);

       //student email input
       System.out.print("Email: ");
       String email = sc.nextLine();    
       String regexEmail = "[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+[.][a-z]{2,3}";

       if(Pattern.matches(regexEmail, email)){
           details.add(true);
       }else{
           details.add(false);
       }    
       student.setStudentEmail(email);

       //student dob input
       System.out.print("DOB:(dd-mm-yyyy): ");
       String dob = sc.nextLine();
                   
       String regexDob = "(0[1-9]|[12][0-9]|[3][01])-(0[1-9]|1[012])-([1-9][0-9][0-9][0-9])";

       if(Pattern.matches(regexDob, dob)){
           details.add(true);
       }else{
           details.add(false);
       }
       student.setStudentAge(Processing.getAge(dob));
       student.setStudentDob(dob);

       //student marks input
       System.out.println("Enter marks: ");
       float[] marks = new float[5];
                       
       for(int i=0; i<marks.length; i++)
       {
           System.out.print("subject "+(i+1)+" = ");
           marks[i]=sc.nextFloat();
       }
       student.setStudentMarks(marks);
   }
   
   private static void checkRemarks(int age, float[] marks)
   {
       if(details.contains(false)){
           System.out.println();
           System.out.println("Invalid details entered..");
           System.exit(0);
       }

       if(Processing.checkAge(age))
       {
           if(Processing.checkMarks(marks))
           {
               student.setPercentage(Processing.calculatePercentage(marks));
               System.out.println();
               System.out.println("Successful: ");
           }
           else
           {
               System.out.println();
               System.out.println("Not Sucessful: ");
               System.exit(0);   
           }
       }
       else{
           System.out.println();
           System.out.println("Not Sucessful: ");
           System.exit(0);
       }
       
   }

   private static void display()
   {
       System.out.println();
       System.out.println("1. Name - "+student.getStudentName());
       System.out.println("2. Contact Number - "+student.getStudentContact());
       System.out.println("3. Email - "+student.getStudentEmail());
       System.out.println("4. DOB - "+student.getStudentDob()+" ");
       System.out.println("5. Age - "+student.getStudentAge());
       System.out.println("6. Marks - "+Arrays.toString(student.getStudentMarks())+" ");
       System.out.println("7. percentage - "+student.getPercentage());
       
   }    
}
