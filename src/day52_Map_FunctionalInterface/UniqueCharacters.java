package day52_Map_FunctionalInterface;

import java.util.*;

public class UniqueCharacters {
    /*
     Write a program that can find the unique characters from a String
          Ex:
                  str = "aabcccdeeeef";
          output:
                  {b=1, d=1, f=1}
     */
    public static void main(String[] args) {
        String str = "aabcccdeeeef";

        Map<String, Integer> result = new LinkedHashMap<>();
        String[] arr = str.split("");

        for (String each : arr) {
            int frequency = Collections.frequency(Arrays.asList(arr), each);
            if (frequency == 1) {
                result.put(each, 1);
            }
        }
        System.out.println(result);

    }

}
