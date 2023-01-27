package day50_Collections_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice {

    public static void main(String[] args_){

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));
//remove all the elements  that are less than 4

        for (int i = 0; i < list1.size(); i++) {
            if(list1.get(i) <4){
                list1.remove(i);
            }
        }
        System.out.println("list1 to remove less than 4 with for loop "+ list1+ " but it failed");
        System.out.println("--------------------------------------------");


        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));
//remove all the elements  that are less than 4
        Iterator<Integer> it = list2.iterator();
/*
        boolean r1 = it.hasNext();
        System.out.println("r1 = " + r1);

        System.out.println(it.next());
        boolean r2 = it.hasNext();
        System.out.println("r2 = " + r2);
        System.out.println(it.next());
*/

        while (it.hasNext()){
            if(it.next()<4){
                it.remove();
            }
        }
        System.out.println("list2 to remove less than 4 with while loop " + list2);
        System.out.println("--------------------------------------------");

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));
        for (Iterator<Integer> i = list3.iterator(); i.hasNext(); ) {
            if(i.next() < 4){
                i.remove();
            }
            
        }
        System.out.println("list3 to remove less than 4 with for loop by using iterator "+ list3);
        System.out.println("--------------------------------------------");

        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        list4.removeIf(each-> each<4);
        System.out.println("list4 to remove less than 4 with removeIf () = " + list4);


    }
}
