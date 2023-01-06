package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {
        // hourly Rate, weeklyHours

        int hourlyRate = 65;
        int weeklyHours = 45;
        int numberofWeeks = 52;

        int salary = hourlyRate * weeklyHours * numberofWeeks;

        //System.out.println(salary);
        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("numberofWeeks = " + numberofWeeks);
        System.out.println("salary = $" + salary);

    }

}
