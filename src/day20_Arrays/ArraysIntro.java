package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        //create a variable that's capable enough to contain 5 names

        String[] myGroup = new String[5]; //0 ~ 4
        myGroup[0] = "Gunay";
        myGroup[1] = "Neira";
        myGroup[2] = "Suat";
        myGroup[3] = "Hulya";
        myGroup[4] = "Mikael";
        // myGroup[5] = "Mustafa"; //it gives error
        // myGroup[-1] = "Adam"; // it cannot be under 0

//        System.out.println(myGroup); //hashcode
        System.out.println(Arrays.toString(myGroup)); //["Gunay", "Neira", "Suat", "Hulya", "Mikael"]

        System.out.println("------------------------------");

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        //index:            0          1           2           3          4          5           6

        // days[7] = "Javaday"; it gives error out of bonds
        System.out.println(Arrays.toString(days));

        int number = 5;

        if (number<1 || number>7){
            System.err.println("Invalid Number");
            System.exit(0);
        }
        System.out.println(days[number-1]);

        System.out.println("----------------------------------" );

        String [] months = {"jan", "feb", "mar", "apr", "may", "jun", "july", "agu", "sep", "oct", "nov", "dec"};
        System.out.println(Arrays.toString(months));

        int num=8;
        if (num<1||num>12){
            System.err.println("Invalid Number");
            System.exit(0);
        }
        System.out.println(months[num]);


    }
}