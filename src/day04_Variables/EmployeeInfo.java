package day04_Variables;

public class EmployeeInfo {

    /*
    Create a class named EmployeeInfo. declare the following variables:
				1. name (String)
				2. age (int)
				3. gender (char)
				4. company (String)
				5. jobTitle (String)
				6. yearsOfExpereince (double)
				7. salary (int)
				8. isFullTime (boolean)
				9. isMarried (boolean)
				10. employeeId (String)
				11. SSN (String)
     */

    public static void main(String[] args) {

        String name = "Mustafa";
        int age = 45;
        char gender = 'F';
        String company = "TBF";
        String jobTitle = "Refree";
        double yearsOfExperience = 16.5;
        int salary = 1200;
        boolean isFullTime = true;
        boolean isMarried = false;
        String employeeId = "242******40";
        String SSN = "7743.1090";

        System.out.println("name = " + name);
        System.out.println("employeeId = " + employeeId);
        System.out.println("gender = " + gender);
        System.out.println("age = " + age);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("company = " + company);
        System.out.println("yearsOfExperience = " + yearsOfExperience);
        System.out.println("isFullTime = " + isFullTime);
        System.out.println("salary = " + salary);
        System.out.println("isMarried = " + isMarried);
        System.out.println("SSN = " + SSN);

    }
}
