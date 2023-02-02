package day53_FunctionalInterface;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BuildInFunctionalInterfaces2 {

    public static void main(String[] args) {
//        create a function that can check if the Integer is contained in an Integer array, return boolean
        BiPredicate<Integer[], Integer> contains = (a,b) -> {
            boolean result = false;
            for (Integer each : a) {
                if(each==b){
                    result = true;
                    break;
                }
            }
            return result;
        };
        Integer [] arr = {1,2,3,4,5,6,7,8,9,10};
        boolean r1 = contains.test(arr, 11);
        System.out.println(r1);

//        create a function that can check if two strings are anagram

        BiPredicate<String,String> anagram =   (a, b) -> {
            String [] arr1 = a.split("");
            String [] arr2 = b.split("");

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return Arrays.equals(arr1,arr2);
        };
String str1 = "kelime";
String str2 = "melike";
        boolean r4 = anagram.test(str1,str2 );
        System.out.println("r4 = " + r4);

//        create a function that can print the given string for given number of times

        BiConsumer<String,Integer> printMultipleTimes = (s, n) -> {
            for (Integer i = 0; i < n; i++) {
                System.out.println(s);
            }
        };

        printMultipleTimes.accept("Java", 5);

        Map<String, String> scrumTeam1 = new LinkedHashMap<>();
        scrumTeam1.put("Abdulhamid","SM");
        scrumTeam1.put("Nikita","Developer");
        scrumTeam1.put("Alina","Developer");
        scrumTeam1.put("Mert","PO");
        scrumTeam1.put("Lee","SDET");
/*
        for (Map.Entry<String, String> pairs : scrumTeam1.entrySet()) {
            String k= pairs.getKey();
            String v= pairs.getValue();
            System.out.println(k+" : "+v);
        }
*/
        scrumTeam1.forEach( (k,v) -> System.out.println(k+" : "+v));

//        create a function that takes two integers and returns  the maximum integer
        BiFunction<Integer, Integer, Integer> maxNum = (a, b) -> (a>b) ? a:b;

        int max = maxNum.apply(100,200);
        System.out.println(max);

        //2. create a function that can merge two integer arrays into a list
BiFunction<int [],int[], List<Integer>> merge = (x,y) -> {
    List<Integer> result = new ArrayList<>();
    for (int each : x) {
        result.add(each);
    }
    for (int each : y) {
        result.add(each);
    }

    return result;
};

int[] arr1 ={1,2,3,4,5};
int[] arr2 ={6,7,8,9,};

List <Integer> nums = merge.apply(arr1,arr2);
        System.out.println(nums);

        // 3. create a function that takes a  list of String and a list of Integer and merge them into a map
        /*
        names ==> {"Josh", "Daniel"}
        score ==> {100, 110}
        map ==> {Josh=100, Daniel=110}
         */
        BiFunction<List<String>,List<Integer>,Map<String,Integer>> merge2 =(j,k) -> {
            Map<String,Integer> map = new HashMap<>();

            for (int i = 0; i < j.size(); i++) {
                map.put(j.get(i),k.get(i));
            }
            return map;

        };

        List<String> names = new ArrayList<>(Arrays.asList("Layan", "Kseniia", "Aygun"));

        List<Integer> scores = new ArrayList<>(Arrays.asList(90, 95, 98));

        Map<String, Integer> students = merge2.apply(names, scores);
        System.out.println("students = " + students);


    }
}
