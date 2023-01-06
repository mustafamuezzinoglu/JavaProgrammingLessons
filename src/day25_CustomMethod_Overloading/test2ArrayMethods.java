package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;

import java.util.Arrays;

public class test2ArrayMethods {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        ArraysUtility.printEachElement(arr1);
        System.out.println("---------------------");

        double[] arr2 = {1.5,2.5,3.5,4.5,5.5};
        ArraysUtility.printEachElement(arr2);
        System.out.println("---------------------");

        char[] arr3 = {'A','B','C','D'};
        ArraysUtility.printEachElement(arr3);
        System.out.println("---------------------");

        String[] names = {"David","Elvira","Ali","Esin"};
        ArraysUtility.printEachElement(names);
        System.out.println("---------------------");

        int[] n1 = {1,24,10,3,4,5,6};

        int max1= ArraysUtility.maximumNumber(n1);
        System.out.println("max1 = " + max1);
        System.out.println("---------------------");

        double[] n2 = {2.3,3.4,9.8,5.2,6.3};

        double max2= ArraysUtility.maximumNumber(n2);
        System.out.println("max2 = " + max2);
        System.out.println("---------------------");

        int[] n = {1,24,10,3,4,5,6};

        int min1= ArraysUtility.minimumNumber(n);
        System.out.println("min1 = " + min1);
        System.out.println("---------------------");

        double[] nd = {2.3,3.4,9.8,5.2,6.3};

        double min2= ArraysUtility.minimumNumber(nd);
        System.out.println("min2 = " + min2);
        System.out.println("---------------------");
    }



}
