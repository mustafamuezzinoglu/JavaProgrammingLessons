package day13_String;

public class StringMethods {
    public static void main(String[] args) {

        String word ="Cydeo";
        char thirdChar =word.charAt(0);
        System.out.println("thirdChar = " + thirdChar);

        System.out.println("-------------------");

        int total=word.length();
        System.out.println("total = " + total);
        char lastChar= word.charAt(word.length()-1);
        System.out.println("lastChar = " + lastChar);
        System.out.println("---------------------");
        String str="wooden spoon";
         str=str.toUpperCase();// "WOODEN SPOON"
        System.out.println(str);

        String s = "Today is a great day to learn java programming language";
        s=s.toUpperCase();
        System.out.println(s);

        String sentence = "Today is a great day to learn java programming language.";
        sentence = sentence.toUpperCase();

        System.out.println(sentence);

    }
}
