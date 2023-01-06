package day21_ForEachLoop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {

        String [ ] students= {"Elif", "Sinem", "Gunay", "Cihad", "David", "James", "Aaron", "Daniel"};

        String[] earlyBirds3 = Arrays.copyOf(students,3);
        System.out.println(Arrays.toString(earlyBirds3));

        String[] earlyBirds5 = Arrays.copyOf(students,5);
        System.out.println(Arrays.toString(earlyBirds5));

        String[] earlyBirds = Arrays.copyOfRange(students,2,5);
        System.out.println(Arrays.toString(earlyBirds));
        System.out.println("-------------------------------");

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        numbers =Arrays.copyOf(numbers,5); //{1,2,3,4,5}
        System.out.println(Arrays.toString(numbers));



    }
}
