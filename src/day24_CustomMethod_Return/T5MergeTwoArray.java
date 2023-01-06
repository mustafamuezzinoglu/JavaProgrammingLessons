package day24_CustomMethod_Return;

import java.util.Arrays;

public class T5MergeTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5};
        int[] merge =merge(arr1, arr2);

        System.out.println(Arrays.toString(merge));
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int element = 0;
        int[] merge = new int[arr1.length + arr2.length];
        for (int i = 0; i <arr1.length; i++) {
            merge[element++] = arr1[i];
        }
        for (int i = 0; i <arr2.length; i++) {
            merge[element++] = arr2[i];
        }
        return merge;
    }
}
/*create a method that can merge two arrays and returnj the new array
				arr1 = {1,2,3}
				arr2 = {4,5}
				{1,2,3,4,5}
*/