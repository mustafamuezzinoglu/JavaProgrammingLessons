package day07_Operators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int num1= 10;
        int num2 = 3;

        //10 divide by 3 is equal to 3 with a remainder of 1

        int division = num1 / num2; //division variable contains the result of num 1 divided by num2

        int remainder = num1 % num2; //remainder variable contains the result of num 1 divided by num2

        System.out.println(num1+ " divided by "+num2 +" is equal to "+ division+ " with a remainder of "+ remainder);
        System.out.println("division = " + division);
        System.out.println("remainder = " + remainder);



    }



}
