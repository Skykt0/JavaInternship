package Week4.inheritence;

import java.util.Scanner;

public class Inheritance5 
{
    public static void main(String[] args) {
        Student s1 = new Student(); 
        s1.showResult();
    }
}

interface PracticalExam
{
    int TotalPracticalMarks = 100;
    void obtainedPracticalMarks();
}

interface TheoryExam
{
    int TotalTheoryMarks = 500;
    void obtainedTheoryMarks();
}

class Exam implements PracticalExam,TheoryExam
{
    Scanner sc = new Scanner(System.in);
    float practicalmarks;
    float theorymarks;
    int totalmarks = 600;

    @Override
    public void obtainedPracticalMarks()
    {
        System.out.print("Enter obtained practical marks(out of 100): ");
        practicalmarks = Integer.parseInt(sc.next());    
    }

    @Override
    public void obtainedTheoryMarks()
    {
        System.out.print("Enter obtained theory marks(out of 500): ");
        theorymarks = Integer.parseInt(sc.next());
    }

    void getResult()
    {
        Float totalobtainedmarks = (theorymarks + practicalmarks);
        float percentage = totalobtainedmarks*100/totalmarks;

        if(percentage>=90)
        {
            System.out.println("Total obtained marks: "+totalobtainedmarks);
            System.out.printf("Percentage: "+"%.2f%n",percentage);
            System.out.println("Result: Pass");
            System.out.println("Grade: A+");
        }
        else if(percentage>=80)
        {
            System.out.println("Total obtained marks: "+totalobtainedmarks);
            System.out.printf("Percentage: "+"%.2f%n",percentage);
            System.out.println("Result: Pass");
            System.out.println("Grade: A");
        }
        else if(percentage>=70)
        {
            System.out.println("Total obtained marks: "+totalobtainedmarks);
            System.out.printf("Percentage: "+"%.2f%n",percentage);
            System.out.println("Result: Pass");
            System.out.println("Grade: B");
        }
        else if(percentage>=60)
        {
            System.out.println("Total obtained marks: "+totalobtainedmarks);
            System.out.printf("Percentage: "+"%.2f%n",percentage);
            System.out.println("Result: Pass");
            System.out.println("Grade: C");
        }
        else if(percentage>=40)
        {
            System.out.println("Total obtained marks: "+totalobtainedmarks);
            System.out.printf("Percentage: "+"%.2f%n",percentage);
            System.out.println("Result: Pass");
            System.out.println("Grade: D");
        }
        else
        {
            System.out.println("Total obtained marks: "+totalobtainedmarks);
            System.out.println("Fail");
        }
    }
}

class Student extends Exam{
    String name;
    String rollno;
    Scanner sc = new Scanner(System.in);

    Student(){
        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        rollno = sc.nextLine();

        obtainedTheoryMarks();
        obtainedPracticalMarks();
    }
    void showResult(){
        System.out.println();
        System.out.println("Name: "+name);
        System.out.println("Roll No. : "+rollno);
        getResult();
    }

}
