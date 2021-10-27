package Week2.keywords.superkeyword;


class ParentClass
{
    void show()
    {
        System.out.println("show method of Super Class");
    }
}

public class InvokeParentMethod  extends ParentClass
{
    public static void main(String args[])
    {
        InvokeParentMethod obj1 = new InvokeParentMethod();
        obj1.display();
    }

    void display()
    {
        show();
        super.show();
    }

    void show()
    {
        System.out.println("show method of sub class");
    }

}
