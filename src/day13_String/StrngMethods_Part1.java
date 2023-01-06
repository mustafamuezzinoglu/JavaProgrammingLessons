package day13_String;

import jdk.swing.interop.SwingInterOpUtils;

public class StrngMethods_Part1 {
    public static void main(String[] args) {


        String str = "Cydeo";
        // index:    01234
        System.out.println(str.charAt(2));

//charAt(int index): return the char at given index, return type--->char
        char ch1 = str.charAt(2);
        System.out.println(ch1);
        String str2 = "Wooden Spoon";
        System.out.println("---------------");

//length(): returns the total number of characters. return type ---> int
        int n1 = str2.length();
        System.out.println(n1);
        int lastIndex = str2.length() - 1;
        System.out.println(lastIndex);
        System.out.println("lastIndex = " + lastIndex);
        System.out.println("----------------");


//toLowerCase(): returns the all lower case version of the String. return type--->String
        String str3 = "JavA";
        System.out.println(str3);
        str3 = str3.toLowerCase();
        System.out.println(str3);
        System.out.println("-----------------");

//toUpperCase(): returns the all Upper case version of the String. return type--->String
        String str4 = "java Spoon";
        System.out.println(str4);
        str4 = str4.toUpperCase();
        System.out.println(str4);
        System.out.println("-----------------");

//trim(): returns the String without all the white spaces (unused spaces). return type --->String
        String str5 = "      Java Programming      Language         ";
        System.out.println(str5);
        str5 = str5.trim();
        System.out.println(str5);
        System.out.println("-----------------");

//indexOf(): returns the first matching character' index number type--->int
        String str6 = "Wooden Spoon";
        System.out.println(str6);
        int indexNumOfFirstO = str6.indexOf("o");
        System.out.println(indexNumOfFirstO);
        int indexNumOfSecondO = str6.indexOf("od");
        System.out.println(indexNumOfSecondO);
        System.out.println("-----------------------");

//lastIndexOf(): returns the last matching character' index number type--->int
        String str7 = "Wooden Spoon";
        System.out.println(str7);
        int indexNumOfLastO = str7.lastIndexOf("o");
        System.out.println("indexNumOfLastO = " + indexNumOfLastO);
        System.out.println("-------------------------");

// replace (oldValue, newValue):
//replaces all the matching character(s) of the String with the given new character(s). return type--->String */
        String str1 = "Wooden Spoon";
        System.out.println(str1);
        str1 = str1.replace("o", "e"); //"Weeden Speen"
        System.out.println(str1);

        String sentence1 = "I love Java, Java is the best programming language";
        System.out.println(sentence1);
        sentence1 = sentence1.replace("Java", "C#");// "Java" to "c#"
        System.out.println(sentence1);
        sentence1 = sentence1.replace("C#", "Java");//"C#" to "Java"
        System.out.println(sentence1);
        System.out.println("-----------------------------------------");

//replaceFirst(oldValue, newValue):
// replaces the first matching character(s) of the String with the given new character(s). return type--->String
        String str8 = "Wooden Spoon";
        System.out.println(str8);
        str8 = str8.replaceFirst("o", "e");
        System.out.println(str8);
        System.out.println("-----------------------------------------");

        String sentence2 = "I love Java, Java is the best programming language";
        sentence2 = sentence2.replaceFirst("Java", "C#");
        System.out.println(sentence2);
        System.out.println("-----------------------------------------");

//subString(begIndex): creates substring starting from the given beginning index to end of the String. return type-->String
        String str9 = "Java Programming Language";
        System.out.println(str9);
        String result1 = str9.substring(str9.indexOf ("P") ); // "Programming Language"
        System.out.println(result1);

//subString(begIndex, endIndex): creates substring starting from the given beginning index to the given ending index.return type-->String
        String result2 = str9.substring(5, 16);
        System.out.println(result2);
        String result3 = str9.substring(str9.indexOf("P"), str9.lastIndexOf(" "));
        System.out.println(result3);

        String s1 = "I love Java";
        s1 = s1.substring(2, 6);
        System.out.println(s1);
        System.out.println("-----------------------------------------------");

// repeat(N): repeats the string N number of times. return type-->
        String str10 = "Java";
        String r = str10.repeat(4);
        System.out.println(r);
        System.out.println("-----------------------------------------------");

//isEmpty():checks if the string' length is zero.return type-->boolean
        String str11 = "  ";
        boolean r1 = str11.isEmpty();
        System.out.println("r1 " + r1); // false
        System.out.println("-----------------------------");

//isBlank(): checks if the string is blank.return type-->boolean
        String str12 = "    ";
        boolean r2 = str12.isBlank();
        System.out.println("r2" + r2); //true
        System.out.println("-----------------------------");

//equals(String): compares the content of the two Strings. return type-->boolean
        String s13 = "Java";
        String s23 = new String("Java");
        System.out.println(s13 == s23);// false
        System.out.println("s1equalss2 " + s13.equals(s23)); //true
        System.out.println("------------------------------");

//equalsIgnoreCase(String): compares the content of the two Strings irrespective of the case sensitivity. return type-->boolean
        String word1 = "JAVA";
        String word2 = "java";
        System.out.println(word1 == word2);// false
        System.out.println("2 " + word1.equalsIgnoreCase(word2)); //true
        System.out.println("------------------------------");

//contains(String): checks if the given string is contained in the String. return type--->boolean
        String sentence = "I love Java Programming Language";
        boolean hasCSharp = sentence.contains("C#");
        System.out.println("hasCSharp = " + hasCSharp);

        boolean hasJava = sentence.contains("Java");
        System.out.println("hasJava = " + hasJava);
        System.out.println("------------------------------");

// startsWith(String): checks if the string started with the given character(s). return type-->boolean
        String name = "Wooden Spoon";
        boolean res1 = name.startsWith("Wood"); //true
        System.out.println("res1 = " + res1);

        boolean res2 = name.startsWith("Spoon"); //false
        System.out.println("res2 = " + res2);
        System.out.println("-------------------------------");

// endsWith(String): checks if the string ends with the given character(s). return type--->boolean

        boolean res3 = name.endsWith("Spoon"); //true
        System.out.println("res3 = " + res3);

        boolean res4 = name.endsWith("Wooden"); //false
        System.out.println("res4 = " + res4);
        System.out.println("-------------------------------");


    }
}
