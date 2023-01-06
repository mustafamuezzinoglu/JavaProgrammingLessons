package day24_CustomMethod_Return;

public class T2MaxNumberOfArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int max = max (array);
        System.out.println(max);
    }

//    2. create a method that can return the maximum number from an array of integers

    public static int max(int[] array) {
        int max = array[0];
        for (int each : array ) {
            if(each > max){
                max=each;
        }
        }
        return max;
    }

}
