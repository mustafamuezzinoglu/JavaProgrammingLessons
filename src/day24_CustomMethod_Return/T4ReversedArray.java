package day24_CustomMethod_Return;

import java.util.Arrays;

public class T4ReversedArray {
    public static void main(String[] args) {

        int []array = {1,2,3,4,5};
        int [] reversed =reverse(array);
        System.out.println(Arrays.toString(reversed));
    }
public static int[] reverse(int [] array){
        int [] reversed = new int[array.length];
    for (int i = array.length-1,k=0; i >=0 ; i--,k++) {
        reversed[k]=array[i];

    }
    return reversed;
}
    /*
    create a method that return the reversed array
					{1,2,3,4,5} === > {5,4,3,2,1}
     */
}
/*
 public  static void reverse (int[]array){
        for (int i = array.length-1,j=0; i >=0 ; i--,j++) {
            array[j]=array[i];
            System.out.println(Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
        int []nums={1,2,3,4,5,6};
        reverse(nums);
 */