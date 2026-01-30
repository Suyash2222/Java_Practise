package in.kgcoding.challenge83;

public class Square extends Shape{
    public Square(int side) {
        this.side = side;
    }

    int side;
    @Override
    public void calculateArea() {
        System.out.println("Area of square is: "+Math.pow(side,2));
    }
}
