package day42_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DisadvantageOfThrowsKeyword2 {

    public static void main(String[] args) throws FileNotFoundException,InterruptedException {//you can use Exception handling for all but not recommended{
        method1();
        method2();
        method3();
        method4();

        String str = null;
        try {
            System.out.println(str.charAt(0));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("e.getMessage() = " + e.getMessage());
        }
    }

    public  static void method1() throws FileNotFoundException {//to handle exception use throws method
        //new FileInputStream("");

    }

    public static void method2() throws FileNotFoundException {//to handle exception use throws method
        method1();
    }

    public static void method3() throws FileNotFoundException {//to handle exception use throws method
        method2();
    }

    public static void method4() throws FileNotFoundException, InterruptedException {//to handle two of exception use throws method
        method3();
        Thread.sleep(1000);
    }

    public static void method5() throws Exception { //exception is parent so handle every exception but it s not recomended
        method4();
    }

}
