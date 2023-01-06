package day09_shortVideos;

import java.util.Scanner;

public class ScannerPractice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Ask the user to enter an integer number
        System.out.println("Enter an integer number");
        int num1 = input.nextInt();
        //ask the user to enter a decimal number
        System.out.println("Enter a decimal number");
        double num2 = input.nextDouble();
        //ask the user to enter a word
        input.nextLine();
        System.out.println("Enter a word");
        String str = input.nextLine();

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("str = " + str);







    }
}
