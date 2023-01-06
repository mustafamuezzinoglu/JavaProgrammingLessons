package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = 10;
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Enter a number");
            numbers[i] = scan.nextInt();// each user entered input will be assigned to the indexes of the array numbers
        }

        int min = numbers[0],
                max = numbers[0];

        for (int i = 0; i < n ; i++) {

            if (numbers[i] < min) {
                min = numbers[i];
            }

            if (numbers[i] > max) {// if there is element in the array that's greater than the current max number
                max = numbers[i]; // assigning greater number to variable max
            }
            }
        System.out.println(Arrays.toString(numbers));
            System.out.println("max num: "+max);
            System.out.println("min num: "+min);

    }
       /*1
        1. create an array that has the numbers 1 to 100
	2. create an array that has the numbers 100 to 1
	3. Write a program that asks user to enter a number 10 times:
			1. store all user entered numbers in an array
			2. find the max number
			3. find the min number
         */
    }

