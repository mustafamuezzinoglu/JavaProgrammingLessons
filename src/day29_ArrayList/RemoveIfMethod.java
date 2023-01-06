package day29_ArrayList;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(list);

      /*  for (int i = 0; i <list.size() ; i++) {
            if(list.get(i) %2 != 0){
                list.remove(i);
            }
        }*/
        list.removeIf(p -> p < 5); //Lambda Expression
        System.out.println("listremove = " + list);
        System.out.println("------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 7, 8, 9, 10));
        System.out.println("list2 = " + list2);
        list2.removeIf(each -> each % 2 == 0);
        System.out.println("list2 remove = " + list2);
        System.out.println("------------------------------");

        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList("Java", "Python", "JavaScript", "C#", "C++", "java", "Java"));
        list3.removeIf(p -> p.toLowerCase().startsWith("j"));
        System.out.println("list3 = " + list3);
        System.out.println("------------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna", "Racecar", "Level", "Eye", "Java", "Python", "Cydeo"));

        names.removeIf(name -> StringUtility.isPalindrome(name));
        System.out.println("removed palindrome names = " + names);

        ArrayList<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList("Anna", "Racecar", "Level", "Eye", "Java", "Python", "Cydeo"));
        names2.removeIf(nam -> !StringUtility.isPalindrome(nam));
        System.out.println("removed non palindrome names = " + names2);

    }
}
