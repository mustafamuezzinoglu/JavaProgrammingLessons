package day39_Recap.CydeoTask;

public class Cydeo {
    public static void main(String[] args) {

        Developer developer = new Developer("Mustafa", 32, 'M', 123456, "Developer", 125000);

        Tester tester = new Tester("Korkmaz", 28, 'F', 15, "SDET", 110000);

        Teacher teacher = new Teacher("Daniel", 35, 'M', 3, "MAth Teacher", 100000);

        Student student = new Student("Suhaib", 34, 'M', 22, "SDET");

        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);

        System.out.println("--------------------------------------");

        developer.setAge(45);
        System.out.println(developer.getAge());

        developer.work();
        tester.work();
        teacher.work();
// student.work(); it gives compile error because student class has not got work method

        developer.eat();
        developer.drink();
        developer.sleep();

        developer.fixingBugs();
        System.out.println("---------------------------------");

        tester.eat();
        tester.drink();
        tester.sleep();

        //tester.fixingBugs(); it gives error because its parent class hasnt this method
        tester.createTicket();
        System.out.println("----------------------");

        teacher.eat();
        teacher.drink();
        teacher.sleep();
        teacher.work();

        System.out.println("------------------");

        student.eat();
        student.drink();
        student.sleep();
        student.study();


    }
}
