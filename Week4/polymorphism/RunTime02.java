package Week4.polymorphism;

public class RunTime02 {
    public static void main(String[] args)
    {
        Bird b = new Bird();    
        Eagle eagle = new Eagle();
        Sparrow sparrow = new Sparrow();
        b.showFlyingHeight(eagle);
        b.showFlyingHeight(sparrow);
    }   
}

class Bird{
    void showFlyingHeight(Bird b){
        b.fly();
    }
    void fly(){
        System.out.println("bird flys....");
    }
}

class Eagle extends Bird{
    void fly()
    {
        System.out.println("eagle flys too high in the sky");
    }
}

class Sparrow extends Bird
{
    void fly()
    {
        System.out.println("sparrow flys low in the sky..");
    }
}
