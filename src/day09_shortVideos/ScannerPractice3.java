package day09_shortVideos;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score");
        int score = input.nextInt();
        input.nextLine();
        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("Score = " + score);
        System.out.println("fullName = " + fullName);


    }


}
