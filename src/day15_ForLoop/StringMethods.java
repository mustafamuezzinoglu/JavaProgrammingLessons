package day15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {
        String str = "    selam";
        boolean r = str.isEmpty();
        System.out.println("r " + r);
        boolean r1 = str.isBlank();
        System.out.println("r1 " + r1);
        System.out.println("-------------------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";
        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equalsIgnoreCase(s2));//true
        System.out.println("yES".equalsIgnoreCase("yes"));
        System.out.println("------------------------------------");

        String sentence = "My favorite language is Java";
        boolean hasCSharp = sentence.contains("C#");
        System.out.println("hasCSharp = " + hasCSharp);
        boolean hasJava = sentence.contains("Java");
        System.out.println("hasJava = " + hasJava);
        boolean hasJava2 = sentence.contains("java");
        System.out.println("hasJava2 = " + hasJava2);
        boolean hasJava3 = sentence.toLowerCase().contains("java");
        System.out.println("hasJava3 = " + hasJava3);
        System.out.println("---------------------");
        String input1 = "I love Java";
        String input2 = "Java";
        System.out.println(input1.equals(input2));//false
        System.out.println(input1.equals(input2));//false

        System.out.println(input1.contains("Java"));//false

        System.out.println(input1.toLowerCase().contains("java"));//TRUE
        System.out.println(input1.toUpperCase().contains("JAVA"));//TRUE
        System.out.println("----------------------");

        String a ="Wooden Spoon";
        System.out.println(a.startsWith("oo"));
        System.out.println(a.endsWith("oon"));
        System.out.println(a.toLowerCase().startsWith("wooden"));
        //in order to ignore the case sensitivity we first create the lower case/ upper case version of string and then compare it with lowercase/uppercase




    }
}
