package day08_IfStatement;

public class GradeReport {

    public static void main(String[] args) {

        /*
        System.out.println( true == !false ); // true
        System.out.println( !true != false ); // false
        System.out.println( !false == true); // true
        System.out.println(!!false); //false
        System.out.println(!!!true); // false
        */

        int score = 75;
        char grade;
        boolean a = score >= 90 && score < 100, b = score >= 80 && score <= 89, c = score >= 70 && score <= 79,
                d = score >= 60 && score <= 69, f = score >= 0 && score <= 59;

        if (a) {
            grade = 'A';
        } else if (b) {
            grade = 'B';
        } else if (c) {
            grade = 'C';
        } else if (d) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println(grade);
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