package day45_AbstractionContinue.ShapeTask;

public class Sphere extends Shape implements Volume{

    public final static double pi = 3.14;
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius <= 0){
            throw new RuntimeException("Invalid radius: " + radius);
        }
        this.radius = radius;
    }

    public Sphere(String name) {
        super(name);
    }

    @Override
    public double area() {
        return 4/3*pi*radius*radius*radius;
    }

    @Override
    public double perimeter() {
        return 4*pi*radius*radius;
    }

    @Override
    public double volume() {
        return 0;
    }
}
