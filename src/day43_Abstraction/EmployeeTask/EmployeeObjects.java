package day43_Abstraction.EmployeeTask;

public class EmployeeObjects {

    public static void main(String[] args) {

//Person person = new Person("Josh", 35, 'M'); it gives error because it's an abstract class so you can create object
//Employee employee = new Employee("Ali",30,'M',42,"SDET",145000.00);  as Person class it's an abstract class

        Tester tester = new Tester("Ali",30,'M',42,"SDET",145000.00);
        Developer developer = new Developer("Alex",28,'M',32,"Web Developer",155000.00);
        Teacher teacher = new Teacher("Angel",28,'F',22,"English Teacher",85000.00);
        Driver driver = new Driver("John",34,'M',42,"Lyft Driver",75000.00);

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(driver);
        System.out.println("--------------------------------");
        
        tester.work();
        tester.sleep();
        tester.bugReport();
        tester.eat();
        System.out.println("--------------------------------");
        
        developer.work();
        developer.sleep();
     //   developer.bugReport();
        developer.eat();
        developer.unitTest();


    }
}
