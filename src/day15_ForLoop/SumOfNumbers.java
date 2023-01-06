package day15_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

 /*
        for (int i = 1; i <101 ; i++) {
           sum +=i;
        }
        System.out.println(sum);
        System.out.println("---------------------------");
*/
        int sum=0;
        Scanner scan=new Scanner(System.in);
        for (int i = 1; i <6 ; i++) {
            System.out.println("Enter a number");
            int num=scan.nextInt();
            sum +=num;
        }
        System.out.println(sum);
        scan.close();




    }
}
