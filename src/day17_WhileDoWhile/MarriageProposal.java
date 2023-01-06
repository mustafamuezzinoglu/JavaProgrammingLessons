package day17_WhileDoWhile;

import java.util.Scanner;

public class MarriageProposal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Will you marry me?");
        String ans = scan.nextLine().toLowerCase();

        while (!(ans.equals("yes") || ans.equals("no"))) {
            System.err.println("Invalid answer, please re-enter");
            System.err.println("Will you marry me?");
            ans = scan.next().toLowerCase();
        }
        if (ans.equals("yes")) {
            System.out.println("Congrats");
        } else {
            System.out.println("Goodbye");
        }
        scan.close();

    }
}
