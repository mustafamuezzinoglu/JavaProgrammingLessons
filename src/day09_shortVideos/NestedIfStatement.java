package day09_shortVideos;

public class NestedIfStatement {
    public static void main(String[] args) {
        int score = 50;
        if (score>=0 && score <=100) { // pre-condition: if score is valid

            if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        }else{ // if the score is NOT valid
            System.out.println("Invalid Score");
        }







    }
}
