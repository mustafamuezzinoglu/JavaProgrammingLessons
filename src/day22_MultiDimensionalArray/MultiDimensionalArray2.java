package day22_MultiDimensionalArray;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class MultiDimensionalArray2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] arr3 = {7, 8, 9};

        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

//        3 dimensioanl array contains 2 d arrays
        //                     array       0       1       2          0           1           2z
        int[][][] arr3D = {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}}};
// index number                         0                               1

        System.out.println(Arrays.deepToString(arr3D)); //3 dimensional için arrays.deeptoString print modeli

// {{1,2,3},{4,5,6},{7,8,9}} ,{{10,20,30},{40,50,60},{70,80,90}}
        System.out.println(Arrays.deepToString(arr3D[1])); //2 dimensional için arrays.deeptoString print modeli

// {40,50,60}
        System.out.println(Arrays.toString(arr3D[1][1])); //1 dimensional için sadece toString

//  9
        System.out.println(arr3D[0][2][2]);
        System.out.println("----------------------------");
        for (int[][] each2D : arr3D) {
            for (int[] each1D : each2D) {
                for (int element : each1D) {
                    System.out.print(element + " ");
                }
            }
        }
        System.out.println();
        System.out.println("1-------------------------------------");

        int[][][][] arr4D = {{{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}}}};
        for (int[][][] each3D : arr4D) {
            for (int[][] each2D : each3D) {
                for (int[] each1D : each2D) {
                    for (int each : each1D) {
                        System.out.print(each);
                    }
                }
            }
        }


    }

}
