package day14_String;

public class EmailDomain_substring {
    public static void main(String[] args) {

        String email = "Cydeo.School@gmail.com";

        int beginningIndex= email.indexOf("@")+1;
        int endingIndex= email.lastIndexOf(".");


        String domain =email.substring(beginningIndex, endingIndex);
        System.out.println("domain = " + domain);
        email=email.replace(domain, "yahoo");
        System.out.println("email = " + email);

        String str1 = "Java is fun, Java is cool, I love Java";
        System.out.println("str1 = " + str1);
        String s1 = str1.substring(0, 10+1); //"Java is fun
        System.out.println("s1 = " + s1);

        int beg = str1.indexOf(" J")+1;
        int end = str1.lastIndexOf(",");
        String s2= str1.substring(beg, end); //Java is cool
        System.out.println("s2 = " + s2);

        String s3= str1.substring(str1.lastIndexOf("I"));
        System.out.println("s3 = " + s3);




    }
}
