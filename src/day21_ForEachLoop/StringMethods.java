package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Java";
        char[] chars =str.toCharArray(); // it replaces to array each characters of string one by one

        System.out.println(Arrays.toString(chars)); //print as an array


        for (char each : chars) { // it takes each element to out from char array
            System.out.print(each+ " "); // arrayden dışarı çıkmış her elementi yazdırır
        }
        System.out.println(); //bir satır alta gelmek için
        System.out.println("-------------------------");

        String sentence = "Wooden Spoon";
        sentence= sentence.concat("s");
        System.out.println("sentence = " + sentence);
       String [] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));

int z= sentence.indexOf(" ");

        System.out.println("z = " + z);
    }
}
