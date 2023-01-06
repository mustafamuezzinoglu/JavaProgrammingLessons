package day05_Concatenation;

public class CarInfo {
    public static void main(String[] args) {
        String year = "2002",
                make = "Honda",
                model = "Civic",
                miles = "150000",
                color = "Beige",
                price = "10000",
                carInfo = year +" " +make +" " +model + ", " + miles + " miles, " + color+ ", " + "$"+price+ ".";
        System.out.println(carInfo);


    }
}
