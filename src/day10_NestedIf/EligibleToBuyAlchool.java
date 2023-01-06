package day10_NestedIf;

public class EligibleToBuyAlchool {
    public static void main(String[] args) {
        String name = "Esin";
        int age = 22;
        boolean isEligible = age>=21;
        boolean hasId = false;

        if(hasId) {

            if (isEligible) {
                System.out.println(name + " is eligible to buy alcohol.");
            } else {
                System.out.println(name + " is NOT eligible to buy alcohol.");
            }

        }else {
            System.out.println("You must have an ID to buy alcohol");
        }


    }
}
