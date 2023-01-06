package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6};
        int[] arr3=new int[arr1.length+arr2.length];
        int element=0;

        for (int i = 0; i <arr1.length ; i++) {
            arr3[element++]= arr1[i];
        }
        for (int i = 0; i <arr2.length ; i++) {
            arr3[element++]= arr2[i];
        }
        System.out.println(Arrays.toString(arr3));
        System.out.println("------------------------------");

        String [] group1 = {"Ali", "Layan", "Aysenur"}; //3 element
        String [] group2 = {"Maria", "Aygun", "Duygu", "Suat", "Valeriy"}; //5 element

        String[] students= new String[group1.length+ group2.length]; //8 element

        int i =0;

        for (String each : group1) { //Ali, Layan, Aysenur
            students[i++] = each;
        }

        for (String each : group2) {
            students[i++] = each;
        }

        System.out.println(Arrays.toString(students));

        /*
        write a program that can merge two arrays of integers
		Ex:
			arr1 = {1,2,3,4}
			arr2 = {5,6}

		output
			arr3 = {1,2,3,4,5,6}

         */
    }
}
