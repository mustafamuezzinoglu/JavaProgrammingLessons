package day35_Encapsulation.encapsulation;

public class  Circle {
    private double radius;
    public static double pi;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        if(radius<=0){
            return;
        }
        this.radius = radius;
    }

    public static void setPi(double pi) {
        Circle.pi = pi;
    }

    public double getRadius() {
        return radius;
    }

    public static double getPi() {
        return pi;
    }


    public double calcArea(){
        double calcArea = pi*radius*radius;
        System.out.println("Circle area is = "+ calcArea);
        return calcArea();
    }

    public double calcPerimeter(){
        double calcPerimeter = 2*pi*radius;
        System.out.println("Circle perimeter is = "+ calcPerimeter);
        return calcPerimeter();
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "Circle area is = " + calcArea() +
                "Circle perimeter is = " + calcPerimeter() +
                '}';
    }
}
/*
 Create a class named Circle
			private variables:
				radius
			public variable:
				pi
		 	Encapsulate all the private fields
		 			1. radius of the circle can not be zero or negative
 			Add a constructor that can set the radius of circle when circle object is created
 			Methods:
 				calcArea()
 				calcPerimeter()
 				toString()

 */