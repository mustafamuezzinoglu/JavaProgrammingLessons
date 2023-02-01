package day52_Map_FunctionalInterface;

import java.util.*;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class InterviewTask2 {
    /*
    Write a program that can find the element that has the highest frequency in an arrayList
	        Note: Must use a map
	        Ex:
	            list: [java, java, python, c#]
	        output:
	            [java=2, python=1, c#=1]
	            element java has the highest frequency
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("java", "java", "python", "c#"));

        Map<String, Integer> result = new LinkedHashMap<>();
        int highestFrequency = Integer.MIN_VALUE;

        for (String each : list) {
            int freq = Collections.frequency(list, each);
            result.put(each, freq);
            if(freq>highestFrequency){
                highestFrequency=freq;
            }
        }
        System.out.println(result);

        for (Map.Entry<String, Integer> pairs : result.entrySet()) {
          if(pairs.getValue()==highestFrequency){
              System.out.println("element "+ pairs.getKey()+" has the highest frequency");
          }
        }


    }
}
