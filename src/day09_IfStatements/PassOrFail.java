package day10_NestedIf;

public class PassOrFail {
    public static void main(String[] args) {

        int score = 101;

        if (score >=0 && score <= 100) {

            if (score >= 60) {
                System.out.println("Congrats, you passed");
            } else {
                System.out.println("Failed");
            }

        }else{
            System.out.println("Invalid score");
        }
    }
}