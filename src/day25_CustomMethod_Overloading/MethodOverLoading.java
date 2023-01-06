package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class MethodOverLoading {

    public static void main(String[] args) {

        int[] intArray = {5, 6, 0, -1, 3, 4};
        Arrays.sort(intArray);

        double[] doubleArray = {10.5, 11.5, 5.5, 4.5};
        Arrays.sort(doubleArray);

        char[] charArray = {'E', 'F', 'B', 'C', 'D', 'A'};
        Arrays.sort(charArray);
//        sum of 10 and 20
        int sum1 = sumOfNumbers(10,20);
//        sum of 10,20,30
        int sum2 = sumOfNumbers(10,20,30);
//        sum of 18.2 and 30.7
        double sum = sumOfNumbers(18.2,30.7);
//        sum of 5.5, 4.5, 6.5
        double sum5 = sumOfNumbers(4.5,5.5,6.5);
//        sum of 4.5, 5.5, 6.5, 7.5
        double sum4=sumOfNumbers(4.5, 5.5, 6.5, 7.5);
    }

    private static int sumOfNumbers(int num1,int num2) {
        return num1+num2;
    }
    private static double sumOfNumbers(double num1,double num2) {
        return num1+num2;
    }
    
    private static int sumOfNumbers(int num1,int num2,int num3) {
        return num1+num2+num3;
    }
    private static double sumOfNumbers(double num1,double num2,double num3) {
        return num1+num2+num3;
    }
    
    private static int sumOfNumbers(int num1,int num2,int num3,int num4) {
        return num1+num2+num3+num4;}
    private static double sumOfNumbers(double num1,double num2,double num3,double num4) {
        return num1+num2+num3+num4;
    }



}
