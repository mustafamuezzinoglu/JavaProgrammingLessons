package day52_Map_FunctionalInterface;

public class Test2 {

    public static void main(String[] args) {

        MySecondFunctionalInterface<String> printEach = s -> {
            for (String each : s.split("")) {
                System.out.print(each);
            }
        };
        printEach.test("Wooden Spoon");
        System.out.println();

        MySecondFunctionalInterface<Integer> cube = n ->  System.out.println(n*n*n);

cube.test(5);









    }
}
