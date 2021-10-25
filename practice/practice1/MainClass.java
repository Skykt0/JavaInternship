package practice.practice1;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass 
{
    static Scanner sc;
    static Student student;

   public static void main(String args[]){
    sc = new Scanner(System.in);
    student = new Student();

    read();
    checkRemarks(student.getStudentAge(), student.getStudentMarks());
    display();
   }

   private static void read()
   {
       System.out.println("Enter details: ");

       // student name input
       System.out.print("Name: ");
       String name = sc.nextLine();
       RegexChecker.checkRegexName(name);

       // student contact input
       System.out.print("Contact Number: ");
       String contact = sc.nextLine();
       RegexChecker.checkRegexContact(contact);

       //student email input
       //email - [a-z0-9]@[a-z][.][org | in | com]

       System.out.print("Email: ");
       String email = sc.nextLine(); 
       RegexChecker.checkRegexEmail(email);   

       //student dob input
       System.out.print("DOB:(dd-mm-yyyy): ");
       String dob = sc.nextLine();
       RegexChecker.checkRegexDob(dob);

       //student marks input
       System.out.print("Enter no. of Subjects: ");
       int numberOfSubjects = sc.nextInt();
       if(numberOfSubjects<=10){
           System.out.println("Enter marks: ");
           float[] marks = new float[numberOfSubjects];
           for(int i=0; i<marks.length; i++)
           {
               System.out.print("subject "+(i+1)+" = ");
               marks[i]=sc.nextFloat();
           }
           student.setStudentMarks(marks);
       } 
       else{
           System.out.println("Number of subjects can not be more than 10");
           System.exit(0);
       }             
   }
   
   private static void checkRemarks(int age, float[] marks)
   {
       if(RegexChecker.details.contains(false))
       {
           System.out.println();
           System.out.print("Invalid: ");
           RegexChecker.checkUserDetails();
           System.out.println();
           System.exit(0);
       }

       else if(Processing.checkAge(age))
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
           }
       }
       else
       {
           System.out.println();
           System.out.println("Not Sucessful: ");    
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
       System.out.println();
   }    
}
