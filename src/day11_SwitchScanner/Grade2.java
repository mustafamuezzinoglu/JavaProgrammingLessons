package day11_SwitchScanner;

import jdk.swing.interop.SwingInterOpUtils;

public class Grade2 {
    public static void main(String[] args) {
        char ch = 'D';
        String res = "";
        switch (ch) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                res = "Passed";
                break;
            case 'F':
                res = "Failed";
                break;
            default:
                res = "Invalid";
                break;

        }
        System.out.println(res);


    }
}
