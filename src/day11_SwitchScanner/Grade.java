package day11_SwitchScanner;

import jdk.swing.interop.SwingInterOpUtils;

public class Grade {
    public static void main(String[] args) {
        char grade = 'E';
        String result = "";
        switch (grade){
            case 'A':
                result = "Excellent" ;
                break;
            case 'B':
                result = "Great Job" ;
                break;
            case 'C':
                result = "Good" ;
                break;
            case 'D':
                result = "Passed" ;
                break;
            case 'E':
                result = "Failed" ;
                break;
            default:
                result = "Invalid" ;
                break;

        }
        System.out.println(result);
    }
}
