package Week2.abstraction.interfacetest;

public class InterfaceTest {
    public static void main(String args[]){
        B b = new B();
        b.profession();
        b.age();

        A a = new A();
        a.profession();
        a.age();
    }
}
interface Person{
    void profession();
    void age();
}

class A implements Person{
    public void profession(){
        System.out.println("A is a doctor.");
    }

    public void age(){
        System.out.println("A's age is 33");
    }
}

class B implements Person{
    public void profession(){
        System.out.println("B is an IAS officer");
    }
    public void age(){
        System.out.println("B's age is 27");
    }
}
