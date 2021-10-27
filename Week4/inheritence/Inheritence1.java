package Week4.inheritence;

import java.util.Scanner;

public class Inheritence1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        System.out.print("Enter radius: ");
        int radius = sc.nextInt();
        System.out.println("Circle's Area of radius "+radius+" is: "+c.circleArea(radius));
        System.out.println("Circle's Perimeter of radius "+radius+" is: "+c.circlePerimeter(radius));
        System.out.println();
        Square s = new Square();
        System.out.println("Square's Area of radius "+radius+" is: "+s.squareArea(radius));
        System.out.println("Square's Perimeter of radius "+radius+" is: "+s.squarePerimeter(radius));
    }   
}
class Maths
{
    static float square(float num)
    {
        float result = num * num;
        return result;
    }
}

class Circle extends Maths
{
    private final float PI = 3.14f;
    float circleArea(float radius)
    {
        return PI * Maths.square(radius);
    }

    float circlePerimeter(float radius)
    {
        return 2 * PI * radius; 
    }
}

class Square extends Maths{
    float squareArea(float length)
    {
        float ans = Maths.square(length);
        return ans;
    }

    float squarePerimeter(float length)
    {
        return 4 * length;
    }
}
