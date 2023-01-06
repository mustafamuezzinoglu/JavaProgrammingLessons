package day32_Constructors;

public class Test {
    public Test(){
        System.out.println("A"); // print A
    }

    public Test(int a){
        this();
        System.out.println("B"); // print A B
    }

    public Test(double a){
        this(10);
        System.out.println("C"); // print A B C
    }

    public Test(String str){
        this(2.5);
        System.out.println("D"); // print A B C D
    }

    public static void main(String[] args) {
        new Test("Java");
    }



}
