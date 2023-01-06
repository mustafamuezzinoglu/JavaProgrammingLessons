package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        // age: 38 years old

        byte age = 38;

        // weight: 160 pounds
        // byte weight= 160; 160 is out of byte' range
        //byte num= -129; // -129 is out of byte 'range
        short weihgt = 160; // 160 is within the range of short,

        //salary: 100,000 $
        //short salary = 100,000; //100000 is out of short' range

        int salary = 100_000; //int is the preferred data type for integer numbers

        //int asset = 3_333_333_333; 3333333333 is out of int' range

        long asset = 3_333_333_333L; // it must be written/added after data "L" if you use long integer

        //tax: 0.26
        float tax = 0.26F; // if you use float it must be added after data "f or F"

        double PI = 3.14;

        // #
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char ch3 =65535;
        System.out.println("ch3 = " + ch3);

        char gender = 'F';
        System.out.println("gender = " + gender);
        char grade = 'F';

        char yesNo = 'Y';
        System.out.println("yesNo = " + yesNo);

        boolean isEmployeed = true;
        System.out.println("isEmployeed = " + isEmployeed);
        boolean isMarried = false;
        System.out.println("isMarried = " + isMarried);

        boolean result = 100 > 300;
        System.out.println("result = " + result);


        String name = "Wooden Spoon";
        String city ="McLean";
        String state = "Virginia";
        String country = "usa";

        System.out.println("name = " + name);

    }


}
