package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {
        String name = "Mustafa Müezzinoğlu",
                districtArea = "Abdurrahman Nafiz Gürman Mah.",
                streetName = "Turunçlu sok.",
                buildingNumber = "Güven Apt. 18/7",
                city = "Güngören/ İSTANBUL",
                zipCode = "34903";

        String address = "\n" + name + "\n" + districtArea + streetName + "\n" +buildingNumber+ " " + zipCode +"\n"+ city;
        System.out.println("address" + address);


    }
}
