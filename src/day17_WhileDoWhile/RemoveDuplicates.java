package day17_WhileDoWhile;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str= "AABBCC";

        String result ="";

        for (int i = 0; i < str.length() ; i++) {
            String ch= ""+str.charAt(i);
            if(result.contains(ch)){
                continue;

            }
            result += ch;
        }
        System.out.println(result);



    }
}
