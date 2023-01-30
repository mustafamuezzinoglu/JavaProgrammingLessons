package day51_Map;

import day29_ArrayList.CoolectionsUtility;

import java.util.*;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "bbcccaaaaa";
//        Collections.frequency();
        String[] arr= str.split("" );

        Map<String,Integer> result = new LinkedHashMap<>();
        for (String each : arr) {
            int frequency =Collections.frequency(Arrays.asList(arr),each);
            result.put(each,   frequency  );
        }

        System.out.println(result);

/*
2. Write a program that can return the frequency of characters
        Note: MUST use map
        Ex: str = "bbcccaaaaa"
        output:
            {b=2, c=3, a=5}
 */











    }
}
