package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //System.out.println("Enter true or false :");
       // boolean result = input.nextBoolean();

        System.out.println("Enter your name :");
        String name = input.nextLine();
        System.out.println("My name is " + name);
        input.close();


    }
}
