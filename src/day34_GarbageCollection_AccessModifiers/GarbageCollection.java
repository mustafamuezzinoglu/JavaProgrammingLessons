package day34_GarbageCollection_AccessModifiers;

import day30_CustomClass.Dog;
import day31_Costructors.Student;
import day32_Constructors.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {
    public static void main(String[] args) {
/*
//        int n = null;

        String st=""; // empty string is an object
        String str= null; //null is the deafult value of non primitive is not an object special value
        System.out.println(str.toUpperCase());*/

        String str = "Wooden Spoon"; // after line 13, "Wooden Spoon" will be eligible for garbage collection
        str = null;
        System.out.println(str);

        Car car1 = new Car("Toyota");
        car1 = null;
        System.out.println(car1);
        System.out.println("--------------------------");

        Dog dog1 = new Dog(); //new dog() has the reference name --> dog1
        dog1.name = "Lucy";
        new Dog();// if u dont have any reference name for this object means this object u cant use it after line 27
        dog1 = new Dog(); // if we assign new dog it took reference name after then line 24 is eligible garbage col
        dog1.name = "Max";
        System.out.println(dog1);

        String language = "Python"; //after assinging language new reference this is eligible for garbage
        language = "Java"; // now python is unreferenced

        System.out.println(language);
        System.out.println("-------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);

        ArrayList<Integer> list2 = list1;

        list2.addAll(Arrays.asList(200, 300, 400));

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1 == list2);
        System.out.println("--------------------------------");


        Student student1 = new Student("Tahir", 30, 'M', 'B', 14);
        student1.grade = 'A';

        Student student2 = student1;
        student1.name = "Ahmet";

        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Java");
//        ArrayList<String> l2 = new ArrayList<>();
        ArrayList<String> l2 = l1;
        l2.add("Python");
        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);


    }
}
