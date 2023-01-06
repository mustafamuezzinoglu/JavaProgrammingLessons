package day11_SwitchScanner;

public class NumberOfDays {
    public static void main(String[] args) {
        int year = 2002;
        int n = 2;
        String res = "";


        if (n >= 1 && n <= 12) {
            switch (n) {
                case 2:
                    res = (year % 4 == 0) ? "29 Days" : "28 Days";
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    res = "30 Days";
                    break;
                default:
                    res = "31 Days";
                    break;
            }
        } else {
            res = "Invalid";
        }
        System.out.println(res);


    }
}
