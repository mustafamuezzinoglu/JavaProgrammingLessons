package day36_Inheritance.employee;

public class Employee {
    public String name;
    public char gender;
    public int age;
    public String jobTitle;
    public int id;
    public double salary;
    public static String companyName;

    public void work(){
        System.out.println(name+ "is working");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
