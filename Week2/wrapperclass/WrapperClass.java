package Week2.wrapperclass;

public class WrapperClass 
{
    public static void main(String[] args)
    {

        // boxing
        Integer intObject = new Integer(20);
        System.out.println("object1: "+intObject);

        Integer intObject1 = Integer.valueOf(20);
        System.out.println("object2: "+intObject1);

        Integer intObject2 = 20; 

        // unboxing
        int a = intObject2.intValue();
        int b = intObject2;

        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}
