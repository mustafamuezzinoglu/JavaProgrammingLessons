package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {
        // > , >= , < , <=

        boolean result1 = 200 >= 40; //false
        System.out.println("result1 = " + result1);
        boolean result2 = 200 >= 40; // true
        System.out.println("result2 = " + result2);
        boolean result3 = 100 >= 100; //true
        System.out.println("result3 = " + result3);
        boolean result4 = 300 >= 500; //false
        System.out.println("result4 = " + result4);
        //credit score of 720
        int creditscore = 725;
        boolean isEligableForLoan = creditscore >= 720; //if the score is 720 or grater, then it is eligable for the loan
        boolean result5 = 100 < 200;//true
        System.out.println("result5 = " + result5);
        boolean result6 = 200 < 180;
        System.out.println("result6 = " + result6);
        int score = 59;
        boolean hasFailed = score <= 59;
        System.out.println("hasFailed = " + hasFailed);
        boolean resuşt7 = 45 <= 60;
        System.out.println("resuşt7 = " + resuşt7);
        System.out.println("-------------------------");
        int x = 100;
        int y = 200;
        boolean equal = x == y;
        System.out.println("equal = " + equal);
        boolean result8 = "muhtar" == "good guy";
        System.out.println("result8 = " + result8);
        boolean result9 = 'a' == 'A';
        System.out.println("result9 = " + result9);
        boolean result10 = "  Java" == "Java  ";
        System.out.println("result10 = " + result10);
        System.out.println("--------------------");
        Boolean result11 = 100 != 200.5; //true
        System.out.println("result11 = " + result11);
        boolean result12 = "Java" != "Break";
        System.out.println("result12 = " + result12);



    }


}
