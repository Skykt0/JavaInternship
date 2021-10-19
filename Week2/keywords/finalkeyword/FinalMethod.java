package Week2.keywords.finalkeyword;

public class FinalMethod extends ParentClass
{
    public static void main(String args[]) 
    {
        FinalMethod obj1 = new FinalMethod();
        obj1.display();
    }

    void display() // compile time error
    {
        System.out.println("this is child class display method");
    }
}

class ParentClass
{
    final void display()
    {
        System.out.println("this is parent class display method");
    }
}
