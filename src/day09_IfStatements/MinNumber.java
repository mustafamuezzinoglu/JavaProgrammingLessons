package day09_IfStatements;

public class MinNumber {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 200;


        if (num1<num2) {
            System.out.println(num1 + " is the minimum number.");
        }
        if (num2<num1) {
            System.out.println(num2 + " is the minimum number.");
        }
        if (num1 == num2) {
            System.out.println(num1 + " is the equal " + num2);
        }
        System.out.println("--------------------------");
        boolean isMinNum = num1<num2;
        boolean isMaxNum = num2>num1;
        if(isMinNum){
            System.out.println(num1 +" is minimum than " + num2);
        }else{
            System.out.println(num2+" is minimum than " + num1 );

        }
        if(isMaxNum){
            System.out.println(num2 +" is maximum than " + num1);
        }else{
            System.out.println(num1+" is maximum than " + num2 );
        }



    }
}
/*
Create a class called MinNumber, Write a program that can print the minimum number between two numbers, if both are equal then print Equal

			Ex:
				n1= 100, n2 = 200;

			output:
				100 is the minimum number


			n1 & n2

			possibility #1: n1 is Min
			possibility #2: n2 is Min
			possibility #3: equal
 */