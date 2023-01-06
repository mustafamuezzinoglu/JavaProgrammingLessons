package day12_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle");

       double r= input.nextDouble();
        input.close();
       double area = r*r*3.14;
       double perimeter = 2*r*3.14;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);





    }
}
