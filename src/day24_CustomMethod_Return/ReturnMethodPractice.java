package day24_CustomMethod_Return;

public class ReturnMethodPractice {
    public static void main(String[] args) {

//    find the max number between 100 & 200
        int maxNumber = findMaxNumber(100, 200);

        System.out.println(maxNumber);

//    multiply the max number by 2

        int multiplicaiton = maxNumber * 2;
        System.out.println("multiplicaiton = " + multiplicaiton);



    }

    public static int findMaxNumber(int a, int b) {
        int result = 0;
        if (a > b) {
            result = a;
        } else {
            result = b;
        }

        return result;
    }

}