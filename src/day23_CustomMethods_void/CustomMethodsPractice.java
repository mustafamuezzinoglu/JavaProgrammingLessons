package day23_CustomMethods_void;

import day02_HelloWorld.HelloWorld;

public class CustomMethodsPractice {
    public static void main(String[] args) {

        helloWorld5Times();
        System.out.println("----------------------");
        helloCydeo5Times();
        System.out.println("----------------------");
        evenNumbers();

    }

//    create a function that can print hello worlds 5 times===> helloWorld5Times
    public static void helloWorld5Times(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("Hello World!");
        }

    }
//    create a function that can print hello Cydeo 5 times
    public static void helloCydeo5Times(){

        for(int i=0; i<5;i++){
            System.out.println("Hello Cydeo!");
        }
    }
//    create a function that can print all even nnumbers from 1 ~10 ===> evenNumbers
    public static void evenNumbers(){
        for (int i = 2; i <10 ; i+=2) {
            System.out.println(i);
        }
    }


}
