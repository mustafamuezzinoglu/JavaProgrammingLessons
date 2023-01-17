package day45_AbstractionContinue;

public interface PropertiesOfInterface {

    int a = 100; // static & final by default
    static int b = 200; // final by default

/*
    public PropertiesOfInterface(int a){
     this.a = a;
    }
*/ // constructors are used for creating objects. we never dont need to create object from the interface

/*
    static {
        b=100;
    }
*/ // static block meant to executed when the class is ready

/*
    public void method1(){
        System.out.println("Instance Method");
    }
*/ // instance methods need to have object and interface can not have any objects at all so no objects no instances


    static void method2() {
        System.out.println("Static method");
    }

    void method3();

        default void method4() {
        System.out.println("Default method");
    }


}
class Test implements PropertiesOfInterface{

    @Override
    public void method3() {

    }

    public static void main(String[] args) {

        new Test().method4();

    }


}