package Week2.abstraction.interfacetest;

public class InterfaceTest {
    public static void main(String args[]){
        B obj = new B();
        obj.m1();
        obj.m2();
    }
}
interface interf{
    public void m1();
    public void m2();
}

abstract class A implements interf{
    public void m1(){
        System.out.println("m1 method implemented by class A");
    }
}

class B extends A{
    public void m2(){
        System.out.println("m2 method implemented by class B");
    }
}
