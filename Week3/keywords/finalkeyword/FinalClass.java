package Week3.keywords.finalkeyword;

public class FinalClass extends SuperClass  // compile time error, can't extends final class
{
    public static void main(String args[])
    {
        FinalClass obj1 = new FinalClass();
        obj1.display();
    }

    void display()
    {
        System.out.println("this is display method of child class");
    }
   
}

final class SuperClass 
{
    void display()
    {
        System.out.println("this is display method of super class");
    }
}
