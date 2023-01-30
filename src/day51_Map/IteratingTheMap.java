package day51_Map;

import com.sun.source.tree.UsesTree;

import java.util.*;

public class IteratingTheMap {

    public static void main(String[] args) {

        // create a map that contains group ID and names group members


        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 95);
        students.put("Maria", 90);
        students.put("Ali", 85);
        students.put("Alex", 80);
        students.put("Ozan", 99);
        students.put("Serkan", 70);
        students.put("Andry", 98);


        /*
        Set<String> keys = students.keySet();
        for (String eachKey : keys) {
            System.out.println(eachKey + " : " + students.get(eachKey));
            students.replace(eachKey,students.get(eachKey) + 5 );
        }
*/

        System.out.println("names" + students);

        Map<String, Integer> earlyBirds = new HashMap<>(); //score>=90
        Map<String, Integer> angryBirds = new HashMap<>(); //score <90

        for (String key : students.keySet()) {
            Integer value = students.get(key);
            if (value >= 90) {
                earlyBirds.put(key, value);
            } else {
                angryBirds.put(key, value);
            }
        }
        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);

        Set<String> names = students.keySet();
        System.out.println("names = " + names);

        Collection<Integer> scores = students.values();
        System.out.println("scores = " + scores);
//we can use list if we want because list has index number also collection can be converted to list directly
        List<Integer> scores2 = new ArrayList<>(students.values());
        System.out.println("scores2 = " + scores2);


        //remove all the students whose score is less than 90
       /* for (Integer value : students.values()) {
            System.out.println("value : " + value);
        }*/
        int maxScore = Integer.MIN_VALUE;

        for (Integer score : students.values()) {
            if (score > maxScore) {
                maxScore = score;
            }
        }
        System.out.println("maxScore = " + maxScore);

        int minScore = Integer.MAX_VALUE;
        for (Integer score : students.values()) {

                if (score < minScore) {
                    minScore = score;
                }
            }
        System.out.println("minScore = " + minScore);

        int max = Collections.max(students.values());
        int min = Collections.min(students.values());

        System.out.println("max = " + max);
        System.out.println("min = " + min);

//how many students has the score of 95 or greater

        int counterValues = 0;

        for (Integer eachScore : students.values()) {
            if (eachScore >= 95) {
                counterValues++;
            }
        }
        System.out.println("counter Values = " + counterValues);

        int counterKeys = 0;

        for (String eachKey : students.keySet()) {
            Integer eachScore = students.get(eachKey);
            if (eachScore >= 95) {
                counterKeys++;
            }
        }
        System.out.println("counter Keys = " + counterKeys);

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
//            System.out.println(entry);
            System.out.println( entry.getKey()+" : "+ entry.getValue());


        }
    }
}
