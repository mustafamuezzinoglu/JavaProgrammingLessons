package day04_Variables;

public class Circle {

    /*
    Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
			PI, radius, diameter, area, perimeter

					Hints: 	PI = 3.14
							area = radius * radius * PI
							Perimeter = 2 * radius * PI
     */
    public static void main(String[] args) {

        double radius = 3.9;
        double PI = 3.14;
        double area = radius * radius * PI;
        double perimeter = 2 * radius * PI;

        System.out.println("if radius is " + radius );
        System.out.println(" circle's area = " + area);

        System.out.println("perimeter = " + perimeter);


    }

}
