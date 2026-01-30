package in.kgcoding.challenge83;

public class TestArea {
    public static void main(String[] args) {
//  Shape shape = new Shape(); can not instantiate Shape because it is abstract
        Circle circle = new Circle(5);
        Square square = new Square(6);
        circle.calculateArea();
        square.calculateArea();
    }
}
