package day42_Exceptions;

public class DisadvantageOfThrowsKeyword {

    public static void main(String[] args)  {

        System.out.println("Hello");

        //    sleep(2.5); // throws

        System.out.println("Hello world");

        System.out.println("-------------------------");

        System.out.println("Hello");

        MorningWorkOut.sleep(2.5); // try & catch

        System.out.println("Cydeo");


    }


    public static void sleep(double seconds) throws InterruptedException {

        Thread.sleep( (long) (seconds * 1000) );

    }

//  it is the fastest method to handle this sleep exception is throws keyword
//  it provides less code and readability
//  but its disadvantage is what if we call a method from somewhere if we use throws method outside the method we can not use this throws keyword function automatically
//  everytime for every exception we have to add throws keyword to method signature again and again

}
