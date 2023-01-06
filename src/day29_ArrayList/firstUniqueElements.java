package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class firstUniqueElements {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,1,2,2,3,4,4,5,6,7));
        ArrayList<Integer> res = new ArrayList<>();

        for (Integer each : numbers) {
            int freq=0;
            for (Integer each1 : numbers) {
                if(each==each1){
                    freq++;
                }
            }
            if(freq==1){
                System.out.println(each);
                break;
            }
        }







    }
}
