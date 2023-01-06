package day36_Inheritance.encapsulation;

import day36_Inheritance.encapsulation.Student;

public class StudentObjects {
    public static void main(String[] args) {
        Student student1 = new Student("Mustafa",45,'M','A',"Cydeo");
        student1.setAge(35);
        System.out.println(student1);
    }
}
