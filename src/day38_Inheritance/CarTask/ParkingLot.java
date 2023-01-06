package day38_Inheritance.CarTask;

public class ParkingLot {

    public static void main(String[] args) {
        Toyota toyota = new Toyota("Camry",2020,20000,"Gray",123456);
        Tesla tesla = new Tesla("Model S",2022,9499,"red",0);
        BMW bmw = new BMW("5.20",2015,15000,"black",25000);


        toyota.start();
//        tesla.start();
//        bmw.start();


    }
}
