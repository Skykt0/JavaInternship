package Week2.keywords.finalkeyword;

import java.util.Scanner;

public class FinalVariable {
    public static void main(String[] args){
      
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Circle radius(in centimeter): ");
        double radius = sc.nextDouble();
        double circleArea = findCircleArea(radius);
        System.out.println("Circle Area is: "+circleArea);
        
    }
    static double findCircleArea(double radius){
        final double PI = 3.14;
        double area;
        area = PI * radius * radius;

        // PI = 22/7; if we try to do this, it will give error

        return area;
    }
}
