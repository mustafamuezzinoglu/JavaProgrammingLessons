package day09_shortVideos;

public class MultiBranchIfStatement {
    public static void main(String[] args) {

        int number = 0;
        boolean positive = number > 0;
        boolean negative = number < 0;
        if (positive) {
            System.out.println("Positive");
        } else if (negative) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
        System.out.println("------------------------");
        int score = 85;
        char grade = ' '; // A, B, C, D, F
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80 && score <= 89) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else { //score <60
            grade = 'F';
        }

        System.out.println(grade);
    }
}
