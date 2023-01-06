package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 4, 1, 2, 11, 3, 3, 4, 5, 5, 6, 7, 7, 8, 9, 9));

        ArrayList<Integer> unique = new ArrayList<>();

        for (Integer each : list1) {
            int frequency = Collections.frequency(list1, each); // finds the frequency of each element
            if (frequency == 1)
                unique.add(each);
        }
        System.out.println("unique = " + unique);
        System.out.println("------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 4, 1, 2, 11, 3, 3, 4, 5, 5, 6, 7, 7, 8, 9, 9));

        ArrayList<Integer> unique2 = new ArrayList<>(list2);// ADD ALL THE ELEMENT OF LİST2
        unique2.removeIf(each -> Collections.frequency(list2, each)>1);
        System.out.println("unique2 = " + unique2);


    }
}
