package in.kgcoding.challenge83;

public class Circle extends Shape{
    public Circle(double radius) {
        this.radius = radius;
    }

    double radius;
    @Override
    public void calculateArea() {
        double areaOfCircle = Math.PI*(Math.pow(radius,2));
        System.out.println("Area Of circle is: "+areaOfCircle);

    }
}
