package day45_AbstractionContinue.ShapeTask;

/*
interface XX{
}
interface YY{
}
abstract class BB{
}
abstract class AA{
}
*/
/*
public abstract class QQ{  // second public class giver error

}
*/

public  class Circle extends Shape { //only this class has to be public because just its name must match the file name
//                                         so rest of the classes access modifier default


    private double radius;

    public final static double pi = 3.14;

    public Circle(double radius) {
        super("Circle");
        setRadius( radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius < 0){
            throw new RuntimeException("Invalid radius :" + radius);
        }
        this.radius = radius;
    }


    @Override
    public double area() {
        return radius*radius*pi;
    }

    @Override
    public double perimeter() {
        return 2*radius*pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                super.toString()+
                ", radius=" + radius +
                '}';
    }
}
