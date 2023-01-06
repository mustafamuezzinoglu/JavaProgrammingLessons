package day33_CustomClass_Statics;

import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Ahmet");
        Student student2 = new Student("Mehmet",'F');
        Student student3 = new Student("Nigara",2267);
        Student student4 = new Student("Mustafa",2267,'A');
        Student student5 = new Student("Esin", 'M',22);
        Student student6 = new Student("Lale", 'M',25,2568);
        Student student7 = new Student("Çınar", 'F',35,3362,'B');


        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);
        System.out.println(student6);
        System.out.println(student7);

        System.out.println(student1==student2);

        Student[] students ={student1,student2,student3,student4,student5,student6,student7};
        System.out.println(Arrays.toString(students));





    }
}
