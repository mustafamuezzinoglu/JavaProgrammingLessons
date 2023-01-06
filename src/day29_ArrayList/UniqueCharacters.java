package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {
// string içindeki tekil karakterkeri bulmak için
        String str = "aaabcccdeeefgggggggggghiiiiiijkkkkkkkkkkkkkkl";
        str.split("");  // öncelikle string string arraye dönüştürülür split ile

        String[] arr =  str.split(""); // sonra non primitive olan stringarray

//how to convert the string to array list
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split(""))); //array liste dönüştürülür
        System.out.println("list = " + list);

        String unique = "";

        for (String each : list) {
            int frequency = Collections.frequency(list,each);
            if(frequency==1){
                unique+=each;
            }
        }
        System.out.println("unique = " + unique);
    }
}
