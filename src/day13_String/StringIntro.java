package day13_String;
import java.lang.String;
import java.util.Scanner;

public class StringIntro {
    public static void main(String[] args) {
        String name1 ="wooden Spoon";
        String name2 ="wooden Spoon";
        String name3 ="wooden Spoon";
        String name4 ="wooden Spoon";
        System.out.println(name1 == name2);
        System.out.println(name2 == name3);
        System.out.println(name3 == name4);
        System.out.println("-----------------");

          String str1=new String("Wooden Spoon");
        String str2=new String("Wooden Spoon");
        String str3=new String("Wooden Spoon");
        String str4=new String("Wooden Spoon");
        System.out.println(str1==str2);
        System.out.println(str2==str3);
        System.out.println(str3==str4);
        System.out.println("--------------------");

        String s1 ="Java";
        String s2=new String("Java");
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        System.out.println("--------------------");
        String s3 ="Java";
        String s4=new String("java");
        System.out.println(s3.equals(s4));
        System.out.println(s3==s4);





    }
}
