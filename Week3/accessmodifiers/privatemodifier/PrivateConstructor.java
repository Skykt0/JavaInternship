package Week3.accessmodifiers.privatemodifier;

public class PrivateConstructor 
{
    public static void main(String[] args)
    {
        Constructor obj1 = new Constructor(); // compile time error   
    }
}

class Constructor{
    private Constructor()
    {
        System.out.println("object created");
    }

    void show()
    {
        System.out.println("hello world");
    }
}
