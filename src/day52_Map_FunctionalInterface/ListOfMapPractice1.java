package day52_Map_FunctionalInterface;

import java.util.*;

public class ListOfMapPractice1 {
    public static void main(String[] args) {

        Map<String, String> scrumTeam1 = new LinkedHashMap<>();
        scrumTeam1.put("Abdulhamid", "SM");
        scrumTeam1.put("Nikita", "Developer");
        scrumTeam1.put("Alina", "Developer");
        scrumTeam1.put("Mert", "PO");
        scrumTeam1.put("Lee", "SDET");

        Map<String, String> scrumTeam2 = new LinkedHashMap<>();
        scrumTeam2.put("Anton", "SDET");
        scrumTeam2.put("Muhammed", "Developer");
        scrumTeam2.put("Gulistan", "Developer");
        scrumTeam2.put("Ahmad", "PO");
        scrumTeam2.put("Nevim", "SM");
        scrumTeam2.put("Atakan", "SDET");

        Map<String, String> scrumTeam3 = new LinkedHashMap<>();
        scrumTeam3.put("YanChun", "BA");
        scrumTeam3.put("Tahir", "Developer");
        scrumTeam3.put("Urantuya", "SM");
        scrumTeam3.put("Veronica", "Developer");
        scrumTeam3.put("Alex", "Developer");
        scrumTeam3.put("Abdulaziz", "Developer");

        Map<String, String> scrumTeam4 = new LinkedHashMap<>();
        scrumTeam4.put("Alim", "PO");
        scrumTeam4.put("Kaiser", "SDET");
        scrumTeam4.put("Alinur", "SDET");
        scrumTeam4.put("Farya", "Developer");
        scrumTeam4.put("Sherzod", "Developer");
        scrumTeam4.put("Gulsen", "SM");
        scrumTeam4.put("David", "Sdet");

        Map<String, String> scrumTeam5 = new LinkedHashMap<>();
        scrumTeam5.put("Elza", "SDET");
        scrumTeam5.put("Mehmet", "Developer");
        scrumTeam5.put("Stefan", "Developer");
        scrumTeam5.put("Rishat", "PO");
        scrumTeam5.put("Ismail", "SM");
        scrumTeam5.put("Tamara", "SDET");
        scrumTeam5.put("Adnan", "QA");

        //    1.1 Create a data structure that can contain all the given maps above
        List<Map<String, String>> list = new ArrayList<>();
        list.add(scrumTeam1);
        System.out.println("list1 = " + list);
        System.out.println("list1.size() = " + list.size());
        list.add(scrumTeam2);
        System.out.println("list2 = " + list);
        System.out.println("list2.size() = " + list.size());
        list.add(scrumTeam3);
        System.out.println("list3 = " + list);
        System.out.println("list3.size() = " + list.size());
        list.add(scrumTeam4);
        System.out.println("list4 = " + list);
        System.out.println("list4.size() = " + list.size());
        list.add(scrumTeam5);
        System.out.println("list5 = " + list);
        System.out.println("list5.size() = " + list.size());
        //   scrumTeams.addAll((Collection<? extends LinkedHashMap<String, String>>) Arrays.asList((LinkedHashMap) scrumTeam1, (LinkedHashMap) scrumTeam1, (LinkedHashMap) scrumTeam1));
        List<Map<String, String>> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(scrumTeam1,scrumTeam2,scrumTeam3,scrumTeam4,scrumTeam5));
        System.out.println("list2 "+ list2);
        System.out.println("list2.size() = " + list2.size());

        // print the names of all employees:
        System.out.println("Names of all employees ");
        int countEmployee=0;
        for (Map<String, String> eachScrumTeam : list) {
            for (Map.Entry<String, String> eachpairs : eachScrumTeam.entrySet()) {
                System.out.println(eachpairs.getKey()+ " : "+ eachpairs.getValue());
                countEmployee++;
            }
        }
        System.out.println("countEmployee = " + countEmployee);
        // Print the names of all scrum masters
        System.out.println("names of all scrum masters: ");
        for (Map<String, String> eachScrumTeam : list) {
            for (String name : eachScrumTeam.keySet()) {
                if(eachScrumTeam.get(name).equalsIgnoreCase("sm")){
                    System.out.println( name);
                }

            }
        }

        //Print the names of all Developers
        System.out.println("names of all developer: ");
        for (Map<String, String> eachScrumTeam : list) {
            for (Map.Entry<String, String> eachPair : eachScrumTeam.entrySet()) {
                if(eachPair.getValue().equalsIgnoreCase("developer")){
                    System.out.println(eachPair.getKey());
            }

            }
        }

        //Print the names of all SDET

        System.out.println("names of all SDET:");
        for (Map<String, String> eachMap : list) {
            for (String name : eachMap.keySet()) {
                if(eachMap.get(name).equalsIgnoreCase("sdet")){
                    System.out.println(name);
                }
            }
        }

        //Print the names of all QA and PO
        System.out.println("names of all  QA and PO:");
        for (Map<String, String> eachMap : list) {
            for (Map.Entry<String, String> eachEmployee : eachMap.entrySet()) {
                if (eachEmployee.getValue().equalsIgnoreCase("po") || eachEmployee.getValue().equalsIgnoreCase("qa")) {
                    System.out.println(eachEmployee.getKey()+" : " + eachEmployee.getValue());
                }
            }
        }














    }
}