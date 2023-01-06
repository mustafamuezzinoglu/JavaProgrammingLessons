package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CoolectionsUtility {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1));
        System.out.println("list = " + list);
//  SORT
        Collections.sort(list);
        System.out.println("list sort = " + list);
        System.out.println("------------------------------");

        ArrayList<Character> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList('A', 'B', 'C', 'D', 'E'));
        System.out.println("list2 = " + list2);
//  REVERSE
        Collections.reverse(list2);
        System.out.println("list2 reverse = " + list2);
        System.out.println("------------------------------");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10,20,30,40,50,60,70));
        System.out.println("list3 = " + list3);
//  SWAP
        Collections.swap(list3,0,list3.size()-1);
        System.out.println("list3 swap = " + list3);
        System.out.println("------------------------------");
        int max = Collections.max(list3);
        int min = Collections.min(list3);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("------------------------------");

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(10,10,20,30,40,50,10,10,10));
        System.out.println("list4 = " + list4);
//  REPLACEALL
        Collections.replaceAll(list4,10,1000);
        System.out.println("list4 replace = " + list4);
        System.out.println("------------------------------");
//  FREQUENCY
        int frequency1000 =Collections.frequency(list4,1000);
        System.out.println("frequency1000 = " + frequency1000);
        System.out.println("------------------------------");

        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java", "Java", "Python","Java", "Python", "Ruby", "C++"));
        int countJava = Collections.frequency(words,"Java");
        int countPython = Collections.frequency(words,"Python");
        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);

    }
}
