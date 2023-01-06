package day35_Encapsulation.encapsulation;

public class PersonObjects {
    public static void main(String[] args) {

        Person p1 = new Person();
//        p1.name = "Daniel"; veriyi direkt cagiramayiz
//        p1.age =;

        p1.setName("Daniel");
        p1.setAge(28);
//        System.out.println(p1.name+ " : "+ p1.age); it gives compiler error

        System.out.println(p1.getName() + " : " + p1.getAge());


    }
}
