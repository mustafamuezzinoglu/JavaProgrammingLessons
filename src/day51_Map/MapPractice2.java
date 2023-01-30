package day51_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice2 {
    public static void main(String[] args) {


        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson", 125000);
        map.put("Steven", 135000);

        // who has the maximum and minimum salary?
        String nameMaxSalary = "";
        String nameMinSalary = "";

        int maxSalary = Integer.MIN_VALUE;
        int minSalary = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> pairs : map.entrySet()) {
            String eachKey = pairs.getKey();
            Integer eachValue = pairs.getValue();

            if (eachValue > maxSalary) {
                maxSalary = eachValue;
                nameMaxSalary = eachKey;
            }
            if (eachValue < minSalary) {
                minSalary = eachValue;
                nameMinSalary = eachKey;
            }

        }

        System.out.println("maxSalary= " + maxSalary);
        System.out.println("name of Max Salary = " + nameMaxSalary);

        System.out.println("minSalary= " + minSalary);
        System.out.println("name of min Salary = " + nameMinSalary);

        //how many employees has the salary between 120k ~ 150K?

        int count = 0;
        for (Integer eachValue : map.values()) {
            if (eachValue >= 120000 && eachValue <= 150000) {
                count++;
            }

        }
        System.out.println(count + " employees have the salary between 120k ~ 150K.");

        //display the names of the employees who are making less than 118k?
        for (Map.Entry<String, Integer> pairs : map.entrySet()) {
            if (pairs.getValue() < 118000) {
                System.out.println(pairs.getKey());
            }

        }
        //increase the salary employee by 10K if the current salary of employee is less than 120K
        System.out.println(map);
        for (Map.Entry<String, Integer> pairs : map.entrySet()) {

            if(pairs.getValue()<120000){
                pairs.setValue(pairs.getValue()+10000);
            }
        }
        System.out.println(map);






    }
}