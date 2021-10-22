package practice.practice1;

public class Student {
    private String name;
    private String email;
    private String contact;
    private String dob;
    private float[] marks;
    private float percentage;
    private int age;

    void setStudentName(String name)
    {
        this.name = name;
    }

    String getStudentName()
    {
        return name;
    }

    void setStudentContact(String contact)
    {
       this.contact = contact;
    }

    String getStudentContact()
    {
        return contact;
    }

    void setStudentEmail(String email)
    {
        this.email = email;
    }

    String getStudentEmail()
    {
        return email;
    }

    void setStudentDob(String dob)
    {
        this.dob = dob;
    }

    String getStudentDob()
    {
        return dob;
    }

    void setStudentMarks(float[] marks)
    {
        this.marks = marks;
    }

    float[] getStudentMarks()
    {
        return marks;
    }

    void setStudentAge(int age){
        this.age = age;
    }
    
    int getStudentAge(){
        return age;
    }

    void setPercentage(float percent){
        this.percentage = percent;
    }

    float getPercentage(){
        return percentage;
    }

}