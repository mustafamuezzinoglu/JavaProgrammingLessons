package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class addIntegerToInteger {
    public static void main(String[] args) {

    int[] mergeInt = mergeArrays(new int[]{1, 2, 3}, new int[]{4, 5, 6});
        System.out.println(Arrays.toString(mergeInt));

        double[] mergeDouble= mergeArrays(new double[] {1.5,2.5,3.5}, new double[]{4.5,5.5,6.5});
        System.out.println(Arrays.toString(mergeDouble));
    }

    private static int [] mergeArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length+ arr2.length];
        int i = 0;
        for (int each : arr1) {
           result[i++]=each;
        }
        for (int each : arr2) {
            result[i++]=each;
        }
     return result;
    }
    private static double [] mergeArrays(double[] arr1, double[] arr2) {
        double[] result = new double[arr1.length+ arr2.length];
        double i = 0.0;
        for (double each : arr1) {
            result[(int) i++]=each;
        }
        for (double each : arr2) {
            result[(int) i++]=each;
        }
        return result;
    }/*
    private static String [] mergeArrays(String[] arr1, String[] arr2) {
        String[] result = new String[arr1.length+ arr2.length];
        String i = "";
        for (String each : arr1) {
            result[i++]=each;
        }
        for (String each : arr2) {
            result[i++]=each;
        }
        return result;
    }
    private static char [] mergeArrays(char[] arr1, char[] arr2) {
        char[] result = new char[arr1.length+ arr2.length];
        char i =' ';
        for (char each : arr1) {
            result[i++]=each;
        }
        for (char each : arr2) {
            result[i++]=each;
        }
        return result;
    }*/
}
/*
1. create a method that can merge two integer arrays.  		

	2. create a method that can merge two double arrays.  	

	3. create a method that can merge two char arrays.   		

	4. create a method that can merge two String arrays.  		

 */
