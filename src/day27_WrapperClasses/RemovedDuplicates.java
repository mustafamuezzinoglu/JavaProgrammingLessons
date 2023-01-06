package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemovedDuplicates {

   public static void main(String[] args) {
        int[] arr = {10, 10, 20, 30, 40, 30, 30, 30};
        arr = removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
       System.out.println("--------------------------------");

       String [] words = {"Java", "Java", "Python", "C#", "Java", "Java"};
       words = removeDuplicates(words);
       System.out.println(Arrays.toString(words));


    }
//removes the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int[]array){

        int[] result = {};

        for (int each : array) {
            if(!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static double[] removeDuplicates(double[]array){

        double[] result = {};

        for (double each : array) {
            if(!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static char[] removeDuplicates(char[]array){

        char[] result = {};

        for (char each : array) {
            if(!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static String[] removeDuplicates(String[]array){

        String[] result = {};

        for (String each : array) {
            if(!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

}
