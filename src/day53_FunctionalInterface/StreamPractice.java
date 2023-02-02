package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6));
        list1 = list1.stream().distinct().collect(Collectors.toList());

        System.out.println(list1);
        int[] arr1 = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6};
        arr1 = Arrays.stream(arr1).distinct().toArray();
        System.out.println(Arrays.toString(arr1));

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        list2 = list2.stream().skip(5).collect(Collectors.toList());
        System.out.println("skip to the index num 7  returns list= " + list2);

        int[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        nums2 = Arrays.stream(nums2).skip(4).toArray();
        System.out.println("skip to the index num 4 returns array = " + Arrays.toString(nums2));

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        list3 = list3.stream().limit(7).collect(Collectors.toList());
        System.out.println("to the index num 7 list3 = " + list3);

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        list = list.stream().limit(7).skip(3).collect(Collectors.toList());
        System.out.println("skip to the index num 3 to the index num 7  = " + list);

        List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        days = days.stream().map(p -> p.substring(0, 3)).collect(Collectors.toList());
        System.out.println("days = " + days);

        List<Integer> list5 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> evens = list5.stream().filter(p -> p % 2 == 0).collect(Collectors.toList());
        System.out.println("evens = " + evens);

        List<String> names = new ArrayList<>(Arrays.asList("Java", "java", "jAvA", "Python", "Ruby"));
        long countJava = names.stream().filter(p-> p.equalsIgnoreCase("java")).count();
        System.out.println("countJava = " + countJava);
        names.stream().filter(p-> p.equalsIgnoreCase("java")).forEach(p-> System.out.println(p));


        List<Integer> list6 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,30));
        boolean r1 = list6.stream().allMatch(p -> p % 2 == 0);
        System.out.println("r1 = " + r1);

        boolean r2 = list6.stream().anyMatch(p -> p >20);
        System.out.println("r2 = " + r2);

        boolean r3 = list6.stream().noneMatch(p -> p%3==0);
        System.out.println("r3 = " + r3);








    }
}
