package Week1.Methods.Overriding;

public class SecondProg {
    public static void main(String args[]){
        Parent p = new Parent();
        int sum = p.sum(4,5);
        System.out.println("sum is: "+sum);

        Child c = new Child();
        int prod = c.sum(4,5);
        System.out.println("prod is: "+prod);

        p.show();
        c.show();
    }
}

class Parent{
    int sum(int a, int b){
        return a+b;
    }

    // return type is Object class
    Object show(){
        System.out.println("the return type is Object class");
        return null;
    }
     
}

class Child extends Parent{
    // to override patent class method the return type should be same
   /*
    String sum(int a, int b){
        return "sub is: "+ (a+b);
    }
    */
    int sum(int a,int b){
        return a*b;
    }

    // return type is String class
    // as String class is sub-class of Object class it is allowed to change return type as sub-class of parent class in overridden method
    String show(){
        System.out.println("the return type is String class");
        return null;
    }

}
