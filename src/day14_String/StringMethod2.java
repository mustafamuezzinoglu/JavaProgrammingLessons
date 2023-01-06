package day14_String;

public class StringMethod2 {
    public static void main(String[] args) {

        String str = "Java is fun, I love learning Java";

        String str2=str.replace("Java", "Phyton");// "Phyton is fun, I love learning Phyton"

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email="JohnSmith@yahoo.com";
        System.out.println("email = " + email);
        email=email.replace("yahoo","gmail");//"JohnSmith@gmail.com"
        System.out.println("email = " + email);
        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
       String sentence2 = sentence.replace("Python", "");
       sentence2 = sentence2.replace("  ", "");
        System.out.println("sentence = " + sentence);
        System.out.println("sentence2 = " + sentence2);

        String s = "Dog Dog Dog Dog Dog Dog Dog Dog";
       s= s.replace("Dog", "Cat");
        System.out.println("s = " + s);
        String s2 = "C# is fun, C# is cool";
        s2= s2.replaceFirst("C#", "Java");
        System.out.println("s2 = " + s2);
        s2= s2.replace("o", "a");
        System.out.println("s2 = " + s2);
        System.out.println("-----------------");
        String result = "Java Java Java";
        System.out.println("result = " + result);
        result =result.replace("a", "e");
        System.out.println("result = " + result);
        result=result.replace("Jeve", "Python");
        System.out.println("result =" + result);
        result=result.replaceFirst("Python", "Java");
        System.out.println("result = " + result);






    }
}
