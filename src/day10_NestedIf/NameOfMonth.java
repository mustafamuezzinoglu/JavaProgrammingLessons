package day10_NestedIf;

public class NameOfMonth {
    public static void main(String[] args) {
        /*
        write a program that can display the name of the month
			number = 1 ~ 12
	2. write a program that can display the name of the day
			number = 1 ~ 7
	3. Write a program that can print the number of days in a month
			Ex:
				number = 1 ~ 12;
			output:
				31 Days
			Hints:
				Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
				Months that has 30 days: 4, 6, 9, 11
				Month that has 28 days: 2
         */

        String nameOfMonth;
        int number = -2;
        if (number >= 1 && number <= 12) {

            if (number == 1) {
                nameOfMonth = "January";
            } else if (number == 2) {
                nameOfMonth = "February";
            } else if (number == 3) {
                nameOfMonth = "March";
            } else if (number == 4) {
                nameOfMonth = "April";
            } else if (number == 5) {
                nameOfMonth = "May";
            } else if (number == 6) {
                nameOfMonth = "June";
            } else if (number == 7) {
                nameOfMonth = "July";
            } else if (number == 8) {
                nameOfMonth = "August";
            } else if (number == 9) {
                nameOfMonth = "September";
            } else if (number == 10) {
                nameOfMonth = "October";
            } else if (number == 11) {
                nameOfMonth = "November";
            } else {
                nameOfMonth = "December";
            }
        } else {
           nameOfMonth = "Invalid number";
        }

        System.out.println(nameOfMonth);

    }
}

