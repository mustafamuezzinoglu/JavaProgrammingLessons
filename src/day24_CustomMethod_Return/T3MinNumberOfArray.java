package day24_CustomMethod_Return;

public class T3MinNumberOfArray {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        int min = min(array);
        System.out.println(min);

    }

    public static int min(int[] array) {
        int min = array[0];
        for ( int i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;

    }
    /*
    3. create a method that can return the minimum number from an array of integers
     */
}
