package day39_Recap.ShapeTask;

public class ShapeObject {
    public static void main(String[] args) {

        Square square = new Square(10);
        System.out.println(square);
        square.setSide(15);
        System.out.println(square);
        System.out.println("-------------------");
        Rectangle rectangle = new Rectangle(5, 6);
        System.out.println(rectangle);
        rectangle.setLength(12);
        System.out.println(rectangle);


        Circle circle = new Circle(7.5);
        System.out.println(circle);
        circle.setRadius(15.5);
        System.out.println(circle);


    }
}
