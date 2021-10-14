package Week1.Methods.Overriding;

public class ForthProg {
    public static void main(String[] args){
        Bird b = new Bird();
    }
}       

class Bird{
    
    final void fly(){
        System.out.println("this is Bird fly method");
    }

    static void eat(){
        System.out.println("this is eat method of parent class");
    }
}
class Sparrow extends Bird{

        void fly(){
            System.out.println("this is child show method");
        }
    
        void eat(){
            System.out.println("this is eat method of child class");
        }
    
}