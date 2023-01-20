package day47_Polymorphism;

import day43_Abstraction.EmployeeTask.Developer;
import day43_Abstraction.EmployeeTask.Employee;
import day43_Abstraction.EmployeeTask.Tester;
import day44_Abstraction.AnimalTask.Animal;
import day44_Abstraction.AnimalTask.Cat;
import day44_Abstraction.AnimalTask.Dog;
import day45_AbstractionContinue.ShapeTask.Circle;
import day45_AbstractionContinue.ShapeTask.Shape;
import day45_AbstractionContinue.ShapeTask.Square;

public class ReferenceTypeCastings {

    public static void main(String[] args) {

        Shape shape = /*(Shape)// it implicitly upcasting its not necessary to write*/ new Circle(4);
        Shape shape2 = new Circle(5);

        // Webdriver driver = (WebDriver) new ChromeDriver(); its upcasting as well

        Animal animal = new Dog("Max", "Husky", 'M', 3, "Small", "White");

        Dog dog1 = new Dog("Lucy", "Husky", 'F', 5, "Large", "Brown");
        Dog dog2 = dog1; // there no casting because both of the same class

        Dog dog = (Dog) animal; //downcasting

        System.out.println(animal.getName());
        System.out.println(dog.getName());

        ((Dog) animal).bark(); // example for downcasting

        Shape shape1 = new Square(5);

        System.out.println(((Square) shape1).getSide());

        System.out.println("------------------------------------");

        Animal animal2 = new Cat("Jim", "Scotish", 'M', 3, "Small", "White");
        Cat cat = (Cat) animal2;
        cat.meow();

        ((Cat) animal2).meow();

        //    (  (Dog) animal2  ).bark(); // it gives classcastexception because there isnt a relation between dog and cat animal2 is a cat object


        Employee employee = new Tester("Ali", 30, 'M', 42, "SDET", 145000.00);

        ((Tester) employee).bugReport();
        //   ((Developer)employee).unitTest();// it gives classCastException because there is not a relation between developer and tester

        Shape s1 = new Circle(10);
        s1.area();
        s1.perimeter();
//s1.volume(); // it gives error because not every single shape has volume and also object does not have it

    }
}
