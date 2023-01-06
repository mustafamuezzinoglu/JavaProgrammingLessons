package day15_ForLoop;

import java.util.Scanner;

public class FormatFullName {
    public static void main(String[] args) {
        System.out.println("Enter your first name:");

        String firstName= new Scanner(System.in).next();

        System.out.println("Enter your last name:");

        String lastName= new Scanner(System.in).next();

        firstName= (firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase());
        lastName= (lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase());

        System.out.println(firstName+ " "+ lastName);



    }
}
