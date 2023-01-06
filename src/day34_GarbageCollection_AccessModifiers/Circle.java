package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {

    public double radius;
    public static double pi ;
    public static String name ;

    public static ArrayList<Integer>numbers;


//    public static Sheet sheet;

    public Circle(double radius) {
        this.radius = radius;
//   pi = 3.14; it doesnt give compile error but not efficient in construstor dont use static
    }

    static {
//        radius = 5; //you cannot use static block set the instances
        pi = 3.14;
        name = "Circle";

        numbers  = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
    }
/*
    public static void main(String[] args) {
        pi=3.14;
        name = "Circle";
        numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        System.out.println("pi = " + pi);
        System.out.println("name = " + name);
        System.out.println("numbers = " + numbers);



    }*/
}
