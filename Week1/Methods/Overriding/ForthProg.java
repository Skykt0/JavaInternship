package Week1.Methods.Overriding;

public class ForthProg {
    public static void main(String[] args){
        Bird b = new Bird();
        b.fly();
        Bird.eat();
    }
}       

class Bird{
    //show method is final, so it can't be overridden by child classes
    final void fly(){
        System.out.println("this is Bird fly method");
    }

    //static method , so it can't be overridden by child class, also known as method hiding
    static void eat(){
        System.out.println("this is eat method of parent class");
    }
}
class Sparrow extends Bird{
    /*  
        void fly(){
            System.out.println("this is child show method");
        }
    */

    /*
        void eat(){
            System.out.println("this is eat method of child class");
        }
    */
}