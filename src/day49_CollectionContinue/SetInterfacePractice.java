package day49_CollectionContinue;

import java.util.*;

public class SetInterfacePractice {

    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(null, null, null, null));

        System.out.println(hashSet);

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(null, null, null, null));

        System.out.println(linkedHashSet);

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
//        treeSet.addAll(Arrays.asList(null, null, null, null));
        System.out.println(treeSet);
    }

}
