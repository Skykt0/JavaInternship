package Week1.Methods;

public class MethodOverloading {
    public static void main(String args[]){
        //method overloading 

        // sum(1,2); ambiguity 
        sum(1,4.3f);
        sum(3.3f,4);

        Methods.sum(5,4);
        Methods.sum(2.2f,5.5f);
        Methods.sum(5,'A');
    }

    static void sum(int a, float b){
        System.out.println(a+b);
    }

    static void sum(float a, int b){
        System.out.println(a+b);
    }

}
class Methods{
    static void sum(int a, int b){
        System.out.println(a+b);
    }
    static void sum(float a, float b){
        System.out.println(a+b);
    }
    static void main(int a, char b){
        System.out.println(a+b);
    }
}
