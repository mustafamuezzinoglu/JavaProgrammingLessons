package day15_ForLoop;

import java.util.Scanner;

public class ReplaceX {
    public static void main(String[] args) {
        System.out.println("Enter a word");
        String word= new Scanner(System.in).next();

       if(word.charAt(0)=='x'){
           word=word.replaceFirst("x", "a");

       }System.out.println("word = " + word);

        System.out.println("Enter a word");
        String word2 =new Scanner(System.in).next();

            word2 = word2.replaceFirst("x", "a").replace("X", "a");

        System.out.println("word2 = " + word2);



    }
}
