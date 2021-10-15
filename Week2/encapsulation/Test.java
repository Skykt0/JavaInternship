package Week2.encapsulation;

public class Test 
{
    public static void main(String[] args)
    {
        Student student1 = new Student();
        student1.setId(101);
        student1.setName("Akash");
        System.out.println("student1 id is : "+ student1.getId());
        System.out.println("student1 name is : "+ student1.getName());
        
    }
}

class Student
{
    private int id;
    private String name;

    public void setId(int id)
    {
        this.id = id;
    }
    
    public int getId()
    {
        return id;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
}
