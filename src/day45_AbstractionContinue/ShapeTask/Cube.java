package day45_AbstractionContinue.ShapeTask;

public class Cube extends Shape implements Volume{

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side <= 0){
            throw new RuntimeException("Invalid side: " + side);
        }
        this.side = side;
    }

    public Cube(String name) {
        super(name);
    }

    @Override
    public double area() {
        return side * side * side;
    }

    @Override
    public double perimeter() {
        return side*4*3 ;
    }

    @Override
    public String toString() {
        return "Cube{" +
                super.toString() +
                ", side=" + side +
                '}';
    }

    @Override
    public double volume() {
        return 0;
    }
}
