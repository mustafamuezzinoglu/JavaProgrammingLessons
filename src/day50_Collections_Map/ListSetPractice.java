package day50_Collections_Map;

import java.util.*;

public class ListSetPractice {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(11, 4, 3, 2, 8, 1, 2, 3, 4, 5));
        set.add(6);
        set.add(5);
        set.add(6);
        set.add(5);
        System.out.println(set);
        Integer[] array = set.toArray(new Integer[0]);

        List<Integer> list = new ArrayList<>(set);
        System.out.println(list);
        list.add(10);
        list.add(5);
        list.add(7);
        list.add(5);
        System.out.println(list);

//        List<String> names = null;
//        System.out.println(names.size());
        System.out.println("------------------------------------");

//pop() LIFO to decrease last index
        List<Character> chars = new Stack<>();
        chars.addAll(Arrays.asList('A','B','C','D'));

        System.out.println("chars = " + chars); //[A,B,C,D]

        ((Stack)chars).pop(); // LIFO we should use down-casting if is a relationship between them

        System.out.println("chars = " + chars); //[A,B,C]

        ((Stack)chars).pop(); // LIFO we should use down-casting if is a relationship between them

        System.out.println("chars = " + chars); //[A,B]

//poll() FIFO to decrease last index
        List<String> names = new LinkedList<>();
        names.addAll(Arrays.asList("James","Jimmy","Kathy","Breanne","Max"));
        System.out.println(names);

        ((LinkedList) names).poll(); //FIFO we should use down-casting if is a relationship between them
        System.out.println(names);

        ((LinkedList<String>) names).poll(); //FIFO we should use down-casting if is a relationship between them
        System.out.println(names);

        ((LinkedList<String>) names).poll(); //FIFO we should use down-casting if is a relationship between them
        System.out.println(names);





    }


}
