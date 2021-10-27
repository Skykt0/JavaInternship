package Week2.keywords.superkeyword;

public class SubClass extends SuperClass
{
    String name = "Ajay";
    void showNames(String name){
        System.out.println("Name is: "+name);
        System.out.println("Name is: "+this.name);
        System.out.println("Name is: "+super.name);
    }
    public static void main(String[] args)
    {
        SubClass obj1 = new SubClass();
        obj1.showNames("Dheeraj");
    }
}

class SuperClass
{
    String name="Akash";
}
