package in.kgcoding.challenge77.util;

import in.kgcoding.challenge77.geometry.Circle;
import in.kgcoding.challenge77.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle cir = new Circle(5);
        Rectangle rec= new Rectangle(10,5);

        double cirArea = Math.PI * Math.pow(cir.radius, 2);
        double rectArea = rec.length * rec.breadth;

        System.out.println("Area of circle is "+cirArea);
        System.out.println("Area of rectangle is "+rectArea);
    }
}
