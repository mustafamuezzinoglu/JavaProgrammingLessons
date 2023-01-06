package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmupTasks {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
        Collections.swap(nums, 0, nums.size() - 1);
        System.out.println(nums);
        System.out.println("--------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));
        System.out.println("with 0 " + numbers);
        int size = numbers.size();
        numbers.removeAll(Arrays.asList(0));
        System.out.println("without 0 " + numbers);
        int newsize = numbers.size();
        int totalNumberOfZeros = size - newsize;
        System.out.println("totalNumberOfZeros = " + totalNumberOfZeros);
        for (int i = 0; i < totalNumberOfZeros; i++) {
            numbers.add(0);
        }
        System.out.println("All zeros are at the end " + numbers);

        System.out.println("----------------------------");

        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));

        ArrayList<Integer> result = new ArrayList<>();
        for (Integer each : numbers2) {
            if (each != 0) {
                result.add(each);
            }
        }
        for (Integer each : numbers2) {
            if (each == 0) {
                result.add(each);
            }
        }
        System.out.println(result);
        System.out.println("--------------------------------------");

        String str = "ABCD123$%#@&456EFG!";
        ArrayList<Character> chars = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }
        ArrayList<Character> letters = new ArrayList<>(chars); // add all the characters
        letters.removeIf(p -> !Character.isLetter(p)); // Lambda //remove the characters are not letters
        System.out.println("letters = " + letters);

        ArrayList<Character> digits = new ArrayList<>(chars); // add all the characters
        digits.removeIf(p -> !Character.isDigit(p)); //remove the characters that are not digits
        System.out.println("digits = " + digits);

        ArrayList<Character> specialCharacters = new ArrayList<>(chars); // add all the characters
        specialCharacters.removeIf(p -> Character.isLetterOrDigit(p)); //remove the characters that are letters and digits
        // specialChar.removeAll( letters );
        //  specialChar.removeAll( digits );
        System.out.println("specialCharacters = " + specialCharacters);
    }
}
/*
write a program that can swap the first and last elements of an ArrayList
 */