package day25_CustomMethod_Overloading;

import utilities.StringUtility;

public class testStringMethod {
    public static void main(String[] args) {

        String str = "Java Programming Language ";

        StringUtility.printEachChar(str);
        System.out.println("---------------------");

        String s1 = "Cydeo Spoon";
       String reverse = StringUtility.reverse(s1);
        System.out.println(reverse);

        System.out.println("---------------------");

        String word = "Civic";
        boolean isPalindrome= StringUtility.isPalindrome(word);
        System.out.println("palindrome = "+ isPalindrome);
        System.out.println("---------------------");

        String[] names = {"Anna","Java","Python","Racecar", "Mom", "Cydeo"};
        int count = 0;
        for (String each : names)  {
            if(StringUtility.isPalindrome(each)){
                count++;
            }
        }
        System.out.println(count);
        System.out.println("---------------------");

        String w1="galeta",w2="talage";
        boolean anagram= StringUtility.anagram(w1,w2);
        System.out.println(anagram);
        System.out.println("---------------------");

        String s2 = "aaaaaaaaaaaaaaabbbbbbbbbbbccccccccccccccc";
        String nunDup=StringUtility.removeDuplicates(s2);
        System.out.println(nunDup);
    }
}
