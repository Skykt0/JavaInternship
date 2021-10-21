package practice.practice1;

public class Student {
    private String name;
    private String email;
    private String contact;
    private String dob;
    private float[] marks;

    private int age;

    void setStudentName(String name)
    {
        this.name = name;
    }

    String getStudentName()
    {
        return this.name;
    }

    void setStudentContact(String name)
    {
       this.contact = contact;
    }

    String getStudentContact()
    {
        return this.contact;
    }

    void setStudentEmail(String email)
    {
        this.email = email;
    }

    String getStudentEmail()
    {
        return this.email;
    }

    void setStudentDob(String dob)
    {
        this.dob = dob;
    }

    String getStudentDob()
    {
        return this.dob;
    }

    void setStudentMarks(float[] marks)
    {
        this.marks = marks;
    }

    float[] getStudentMarks()
    {
        return this.marks;
    }

    void setStudentAge(int age){
        this.age = age;
    }
    
    int getStudentAge(){
        return this.age;
    }

}