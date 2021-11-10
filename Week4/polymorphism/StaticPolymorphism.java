package Week4.polymorphism;

public class StaticPolymorphism 
{
    public static void main(String[] args){
        Adder add = new Adder();
        add.sum(5, 6);
        add.sum(9999, 999);
    }
}

class Adder
{
    void sum(int a, int b)
    {
        System.out.println("Sum is: "+(a+b));
    }

    void sum(int a, int b, int c)
    {
        System.out.println("Sum is: "+(a+b));
    }
}
