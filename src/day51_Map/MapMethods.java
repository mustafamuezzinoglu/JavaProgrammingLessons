package day51_Map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {

        // student name & score:


        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 95);
        students.put("Maria", 95);
        students.put("Ali", 95);
        students.put("Alex", 96);
        students.put("Ozan", 98);
        students.put("Serkan", 97);
        students.put("Andry", 98);

        students.put("Ali", 85);
        students.put("Ali", 80);
        students.put("Ali", 75);

        System.out.println("students = " + students);
        System.out.println(students.size());

        //display the score of Alex
        System.out.println(students.get("Alex")); // get method returns value after given the key

//replace ALi' score to 90
        students.replace("Ali", 75, 90);
        System.out.println(students);
//remove one pair
        students.remove("Alex");
        System.out.println(students);
        students.remove("Ozan");
        System.out.println(students);

        boolean r1 = students.containsKey("Muhtar");//based on key verify if contain or not
        boolean r2 = students.containsKey("Serkan");
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);

        boolean r3 = students.containsValue(90);//based on value verify if contain or not
        System.out.println("r3 = " + r3);

        System.out.println("students.isEmpty() = " + students.isEmpty());
        Map<String, Integer> map1 = new HashMap<>();
        map1.putAll(students); //it inserts one map into another map
        System.out.println("map1 = " + map1);
        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(students);
        System.out.println("map2 = " + map2);

        System.out.println(map1==map2); //if use == false because there are two new objects
        System.out.println(map1.equals(map2)); //if use equals true because two new object are same

        map1.clear();// clear method delete all pairs
        map2.clear();
        System.out.println("map1 = " + map1);
        System.out.println("map2 = " + map2);









    }
}
