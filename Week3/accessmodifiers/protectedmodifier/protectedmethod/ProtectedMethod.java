package Week3.accessmodifiers.protectedmodifier.protectedmethod;

public class ProtectedMethod 
{   
    String name;
    int id;
    protected void setValues(String name, int id)
    {
        this.name = name; 
        this.id = id;
    }
    protected void display()
    {
        System.out.println("Name is: "+this.name);
        System.out.println("Id is: "+this.id);
    }
}
