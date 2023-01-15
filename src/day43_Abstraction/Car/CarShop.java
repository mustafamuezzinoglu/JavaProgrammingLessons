package day43_Abstraction.Car;

public class CarShop {

    public static void main(String[] args) {

//        Car car = new Car("Cyedo","25","Blue",2022,100000) ;
//    We can not create object from Abstract class, because abstract class is not concrete

        Honda honda = new Honda("Civic","Beige",2002,12000);
        Audi audi = new Audi("Q5", "White", 2010,35000);
        Tesla tesla = new Tesla("Model13","Blue",2020,60000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);
        System.out.println("----------------------------------------");

        honda.setColor("Red"); //we can set the color
        audi.setColor("Pink");
        tesla.setColor("Green");
// we can not the other featire because they are final
        honda.setPrice(20000); //we can set the price
        audi.setPrice(40000);
        tesla.setPrice(52000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

    }
}
