package Week3.abstraction.abstractclass;

public class MyClass 
{
    public static void main(String args[])
    {
        Rectangle rectangle = new Rectangle();
        rectangle.draw();

        Circle circle = new Circle();
        circle.draw();
    }
}

abstract class Shape
{
    abstract void draw();
}

class Rectangle extends Shape
{
    void draw(){
        System.out.println("draws rectangle shape..");
    }
}
class Circle extends Shape
{
    void draw(){
        System.out.println("draws circle shape..");
    }
}