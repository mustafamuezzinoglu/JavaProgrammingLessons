package day10_NestedIf;

public class GradeReport {

    public static void main(String[] args) {



        int score = 60;
        String  grade;
        boolean a = score >= 90 , b = score >= 80 , c = score >= 70 ,
                d = score >= 60 , f = score >= 0 ;

        if(score>=0 && score <=100){


        if (a) {
            grade ="Excellent";
        } else if (b) {
            grade = "Great";
        } else if (c) {
            grade = "Good";
        } else if (d) {
            grade = "Passed";
        } else {
            grade = "Failed";
        }
        System.out.println(grade);

        }else {
            System.out.println("Invalid Score");
        }

        }


}

/*
score:
    90 ~ 100 ==> Excellent
    80 ~ 89 ==> Great
    70 ~ 79 ==> Good
    60 ~ 69 ==> Passed
    0 ~ 59 ==> Failed

 */