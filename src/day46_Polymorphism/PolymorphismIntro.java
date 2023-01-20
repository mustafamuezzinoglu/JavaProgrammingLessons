package day46_Polymorphism;

import day43_Abstraction.EmployeeTask.*;
import day44_Abstraction.AnimalTask.Animal;
import day44_Abstraction.AnimalTask.Cat;
import day44_Abstraction.AnimalTask.Dog;
import day44_Abstraction.AnimalTask.Playable;
import day45_AbstractionContinue.ShapeTask.*;

import java.util.ArrayList;

public class PolymorphismIntro {

    public static void main(String[] args) {

        String str = "Wooden Spoon";

        Integer n1 = 2;

        double n2 = 5.5;

        boolean r1 = true;

        Object[] array = {str, n1, n2, r1, new Circle(4), new Square(7)};


        Employee tester = new Tester("Ali", 30, 'M', 42, "SDET", 145000.00);
        Employee developer = new Developer("Alex", 28, 'M', 32, "Web Developer", 155000.00);
        Employee teacher = new Teacher("Angel", 28, 'F', 22, "English Teacher", 85000.00);
        Employee driver = new Driver("Jhon", 34, 'M', 42, "Lyft Driver", 75000.00);

        ArrayList<Person> cydeoEmployees = new ArrayList();

        cydeoEmployees.add(tester);
        cydeoEmployees.add(developer);
        cydeoEmployees.add(teacher);
        cydeoEmployees.add(driver);

        System.out.println("-------------------------------------------");

        Employee employee = new Teacher("Angel", 28, 'F', 22, "English Teacher", 85000.00);
        Employee employee1 = new Developer("Alex", 28, 'M', 32, "Web Developer", 155000.00);
        employee.work(); // polymorphism object is executed and override method is executing
        employee1.work();

        Employee employee2 = new Tester("Ali", 30, 'M', 42, "SDET", 145000.00);
//         employee2.bugreport(); it give compile error because polymorphism it only occurs when the parent is the reference in java reference type always decides what you can call and what you can access

        Animal animal = new Dog("Max","Husky",'M', 4, "Large","White");
//      Dog animal = new Dog("Max","Husky",'M', 4, "Large","White");

        animal.drink();
        animal.eat();
//      animal.play(); it gives an error because animal they do not have play method
//      animal.bark(); it gives an error because animal they do not have bark method

        Playable animal2 = new Dog("Max","Husky",'M', 4, "Large","White");
        System.out.println(animal2.isFriendly);
        animal2.play();
//        animal2.drink(); it gives an error because Playable they do not have drink method
//        animal2.eat();   it gives an error because Playable they do not have eat method

        Animal animal3 = new Cat("Love", "Siamese", 'F', 2, "Large", "Black");

        Shape shape = new Circle(5);
        System.out.println("shape.area() = " + shape.area());

        boolean isSquare = shape instanceof Square;
        boolean isRectangle= shape instanceof Rectangle;
        boolean isTriangle = shape instanceof Triangle;
        boolean isCircle = shape instanceof Circle;

        System.out.println("isSquare = " + isSquare);
        System.out.println("isTriangle = " + isTriangle);
        System.out.println("isRectangle = " + isRectangle);
        System.out.println("isCircle = " + isCircle);

        /*
        Webdriver driver :
        if (driver instanceof Chrome){
        Chrome browser will open
        }else if(driver instanceof Firefox){
        Firefox browser will open
        }
         */


    }
}
