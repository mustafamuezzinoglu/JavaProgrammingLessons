package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        int []array = {1,1,2,3,3,4,5,5,6,7,7,7,2,4,6};
        int [] unique =uniqueElements(array);
        System.out.println(Arrays.toString(unique));

        double[] array2 = {1.5,2.5,1.5,3.5,4.5,4.5,5.5,5.5};
        double[] unique2 = uniqueElements(array2);
        System.out.println(Arrays.toString(unique2));

    }
// returns the unique elements of the array as a new array
    public static int[]uniqueElements (int[] array){
        int[] result = {};//uniqur elementlerden oluşacak yeni bir boş array tanımlanır
        for (int each : array ) { //array içindekileri tek tek dışarı alır değer olarak
            if(ArraysUtility.frequencyOfElement(array,each)==1){ //array içindeki her each değerin 1 e eşit olup olmadığı ile ilgili emthodu çağırır
              result =  ArraysUtility.addElement(result,each);// tanımlanan boş arraya 1e eşit olan each elementler eklenir
            }
        }
        return result;
    }

    // returns the unique elements of the array as a new array
    public static double[]uniqueElements (double[] array){
        double[] result = {};//uniqur elementlerden oluşacak yeni bir boş array tanımlanır
        for (double each : array ) { //array içindekileri tek tek dışarı alır değer olarak
            if(ArraysUtility.frequencyOfElement(array,each)==1){ //array içindeki her each değerin 1 e eşit olup olmadığı ile ilgili emthodu çağırır
                result =  ArraysUtility.addElement(result,each);// tanımlanan boş arraya 1e eşit olan each elementler eklenir
            }
        }
        return result;
    }

    // returns the unique elements of the array as a new array
    public static char[]uniqueElements (char[] array){
        char[] result = {};//uniqur elementlerden oluşacak yeni bir boş array tanımlanır
        for (char each : array ) { //array içindekileri tek tek dışarı alır değer olarak
            if(ArraysUtility.frequencyOfElement(array,each)==1){ //array içindeki her each değerin 1 e eşit olup olmadığı ile ilgili emthodu çağırır
                result =  ArraysUtility.addElement(result,each);// tanımlanan boş arraya 1e eşit olan each elementler eklenir
            }
        }
        return result;
    }

    // returns the unique elements of the array as a new array
    public static String[]uniqueElements (String[] array){
        String[] result = {};//uniqur elementlerden oluşacak yeni bir boş array tanımlanır
        for (String each : array ) { //array içindekileri tek tek dışarı alır değer olarak
            if(ArraysUtility.frequencyOfElement(array,each)==1){ //array içindeki her each değerin 1 e eşit olup olmadığı ile ilgili emthodu çağırır
                result =  ArraysUtility.addElement(result,each);// tanımlanan boş arraya 1e eşit olan each elementler eklenir
            }
        }
        return result;
    }

}
