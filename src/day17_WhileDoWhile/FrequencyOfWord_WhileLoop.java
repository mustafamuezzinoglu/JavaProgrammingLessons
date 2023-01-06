package day17_WhileDoWhile;

import java.util.Scanner;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = scan.nextLine();
        System.out.println("Enter the word that out from sentence");
        String word = scan.next();
        int frequancy = 0;

        while (str.contains(word)) {
            str = str.replaceFirst(word, "");
            frequancy++;
        }
        System.out.println(frequancy);
        System.out.println("-----------------------------");

        String sentence = "cat cat cat cat dog dog dog cat cat ";
        int countCat = 0;
        while (sentence.contains("cat")) {
            sentence = sentence.replaceFirst("cat", "");
            countCat++;

        }
        System.out.println(countCat);
        System.out.println("------------------------------");

        String s = "java java java python python python";
        int countJava = 0;
        int countPython = 0;

        while (s.contains("java") || s.contains("python")) {
            if (s.contains("java")) {
                s = s.replaceFirst("java", "");
                countJava++;
            }
            if (s.contains("python")) {
                s = s.replaceFirst("python", "");
                countPython++;
            }

        }
        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);
        scan.close();
    }
}