package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElements2 {
    public static void main(String[] args) {
        int[] numbers = {100, 200, 300, 400, 500, 600};

        numbers = removeElement(numbers, 1);//it creates new array{100,300,400,500,600}
        System.out.println(Arrays.toString(numbers));
        numbers = removeElement(numbers, 1);//it creates new array after new array {100,400,500,600}
        System.out.println(Arrays.toString(numbers));
    }


    public static int[] removeElement(int[]array,int index){
        if(index<0 || index>array.length-1){
            System.err.println("Invalid index: " + index);
            System.exit(0);
        } //index numarası array indexi dışındaki bir rakamsa ınavlid olması için

        int[] result ={}; // geçici bir result array tanımlıyoruz
        for (int i = 0; i < array.length; i++) { // i:array's index number
            if(i != index){ //element çıkartacağımız element değilse
                ArraysUtility.addElement(result,array[i]); //geçici resulta her elementi ekliyıruz
            }
        }
        return result;
    }













}
