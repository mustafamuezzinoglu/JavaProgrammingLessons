package day52_Map_FunctionalInterface;

public class Test {

    public static void main(String[] args) {

//        function1: create a function that can display a number id odd or even
        MyFirstFunctionalInterface oddOrEvenNumber = n -> {
            if (n % 2 == 0) {
                System.out.println(n + " is even nnumber");
            } else {
                System.out.println(n + " is odd number");
            }
        };

        oddOrEvenNumber.apply(20);
//        function2: create a function that can check if a person is eligible to buy alcohol
        MyFirstFunctionalInterface isEligibleToBuyAlcohol = (age) -> {
            if (age >= 21) {
                System.out.println("Eligible to buy alcohol");
            } else {
                System.out.println("Not eligible to buy alcohol");
            }
        };

        isEligibleToBuyAlcohol.apply(41);

//        function3: create a function that can display the cube of a number
        MyFirstFunctionalInterface printCube = number -> System.out.println(number * number * number);

        printCube.apply(5);

//        function4: create a function that can check if a number is evenly divisible
        MyFirstFunctionalInterface divisibleBy3And5 = n -> {
//            if (n % 3 == 0 & n % 5 == 0) {
            if (n % 15 == 0) {
                System.out.println(n + " is divisible by 3 and 5");
            } else {
                System.out.println(n + " is NOT divisible by 3 and 5");

            }
        };
        divisibleBy3And5.apply(30);

    }
}
