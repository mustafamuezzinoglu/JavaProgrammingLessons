package day17_WhileDoWhile;

public class test {
    public static void main(String[] args) {
        String str="   Java    is java in   ghg  everywhere    is    Java  ";
        boolean Step = false;
        int count = 0;

        for (int i = 0; i < str.length() ; i++) {
            if(!(str.charAt(i) == ' ')){
                if(!Step){
                    Step = true;
                    count++;
                }
            }else{
                Step = false;
            }
        }
        System.out.println("count = " + count);
    }
}