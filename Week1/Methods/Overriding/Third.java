package Week1.Methods.Overriding;

public class Third {
    public static void main(String[] args){
        Parent1 p = new Parent1();
        p.sum(5, 6);
        
        Child1 c = new Child1();
        c.sum(5, 6);
    }
}

class Parent1{
    public void sum(int a, int b){
        System.out.println("sum is: "+(a+b));
    }
}

class Child1 extends Parent1{
    /*
        void sum(int a, int b){
            System.out.println("product is: "+(a*b));
        }

    */

    public void sum(int a, int b){
        System.out.println("product is: "+(a*b));
    }
    
}
