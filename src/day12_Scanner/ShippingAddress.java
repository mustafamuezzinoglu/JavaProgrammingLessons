package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter your full name");
        String name = scan.nextLine();

        System.out.println("Enter your building number");
        String buildingNumber = scan.next();
        scan.nextLine();
        System.out.println("Enter your Street name");
        String streetName = scan.nextLine();

        System.out.println("Enter your City name");
        String cityName = scan.nextLine();

        System.out.println("Enter your state");
        String state = scan.next();

        System.out.println("Enter your zip code");
        String zipCode = scan.next();

        System.out.println(name);
        System.out.println(buildingNumber + " "+ streetName);
        System.out.println(zipCode);
        System.out.println(cityName+" "+ state);



        scan.close();




    }
}
