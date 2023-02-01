package day52_Map_FunctionalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class InterviewTask1 {
    /*
    Write a program that can find the character that has the highest frequency in a String
        Note: Must use a map
        Ex:
            str = "eeeeeaaabbbbccccdd"
        Output:
            {e=5, a=3, b=4, c=4, d=2 }
            character e has the highest frequency
     */
    public static void main(String[] args) {

        String str = "eeeeeaaabbbbccccdd";

        Map<String,Integer> result = new LinkedHashMap<>();

        String []arr = str.split("");
        int highestFrequency = Integer.MIN_VALUE;;
        for (String each : arr) {
            int frequency = Collections.frequency(Arrays.asList(arr),each);
            result.put(each,frequency);
            if (frequency>highestFrequency){
                highestFrequency=frequency;
            }
        }
        System.out.println(result);
        for (Map.Entry<String, Integer> pairs : result.entrySet()) {
            if(pairs.getValue()== highestFrequency){
                System.out.println("character "+ pairs.getKey()+" has the highest frequency");
            }
        }



    }
}
