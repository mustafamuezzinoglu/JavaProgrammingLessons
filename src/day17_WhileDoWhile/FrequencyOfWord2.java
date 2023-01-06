package day17_WhileDoWhile;

public class FrequencyOfWord2 {

    public static void main(String[] args) {

        String word="cat cat dog dog";
        int count = 0;
        for (int i = 0; i < word.length()-2; i++) {
           String str= word.substring(i,i+3);
//
            if (str.equals("cat")||str.equalsIgnoreCase("dog")){
                count++;
            }

        }
        System.out.println(count);

    }
}
