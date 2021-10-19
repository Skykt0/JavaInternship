package Week2.accessmodifiers.protectedmodifier;

import Week2.accessmodifiers.protectedmodifier.protectedmethod.*;

public class MyClass  extends ProtectedMethod
{
    public static void main(String[] args)
    {
        MyClass obj1 = new MyClass();
        obj1.setValues("Akash Tanwar", 101);
        obj1.display();
    }
}
