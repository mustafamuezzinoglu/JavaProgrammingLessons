package day45_AbstractionContinue.ShapeTask;

public class Cylinder extends Shape implements Volume{

    public final static double pi = 3.14;
    private double radius;
    private double height;

    public Cylinder( double radius, double height) {
        super("Cylinder");
        setRadius(radius);
        setHeight(height);
    }

    @Override
    public double area() {
        return pi*radius*radius*height;
    }

    @Override
    public double perimeter() {
        return (radius*2+height)*2;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height <= 0){
        throw new RuntimeException("Invalid height: " + height);
    }
        this.height = height;
    }

    public void setRadius(double radius) {
        if(radius <= 0){
            throw new RuntimeException("Invalid radius: " + radius);
        }
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                super.toString()+
                ", radius=" + radius +
                ", height=" + height +
                '}';
    }

    @Override
    public double volume() {
        return 0;
    }
}
