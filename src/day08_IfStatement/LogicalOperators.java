package day08_IfStatement;

import jdk.swing.interop.SwingInterOpUtils;

public class LogicalOperators {
    public static void main(String[] args) {
        String name = "Daniel";
        int age = 34;
    String citizen = "Nortrh kOREA USA";

    boolean isEligiable = age >18 && citizen == "USA";

        System.out.println(name + " is eligiable to vote " + isEligiable  );
        System.out.println("------------------");
        String name2 = "John";
        int creditScore = 800;
        int age2 = 40;
        int income = 40000;

        boolean isEligibleForLoan = creditScore >=700 && age2 >= 21 && income >=60000;
        System.out.println("isEligibleForLoan = " + isEligibleForLoan);
        System.out.println("----------------------");

        String name3 = "Musti";
        int age3  = 21;
        char gender = 'F';

        boolean isEligible = age >= 18 && (gender == 'M' || gender == 'F');
        System.out.println(name3 + " is eligible for register: " + isEligible);
        System.out.println("---------------------------");

        String name4 = "eray";
        String countryOfBirth = "USA";
        boolean marriedToUSCitizen = false;
        boolean isEligible4 = countryOfBirth == "USA" || marriedToUSCitizen == true;
        System.out.println(name4 + " is eligible to apply for US citizenShip: " + isEligible4);
        System.out.println("------------------------");
        String name5 ="Anna";
        double gpa = 2.5;
        int familyIncome = 40000;
         boolean isEligible5 = gpa >= 3.5 || familyIncome <= 60000;
        System.out.println(name5 + " is eligible for scholarship " + isEligible5);
        boolean result2 = true;
        System.out.println("result2 = " + result2);
        boolean result3 = !result2;
        System.out.println("result3 = " + result3);
        System.out.println("-------------------------");
        int score = 80;
        boolean passed = score >=60;
        boolean failed = !passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);
    }
}
