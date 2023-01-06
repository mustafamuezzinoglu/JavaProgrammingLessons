package day08_IfStatement;

public class EligibleToVote {
    public static void main(String[] args) {
        String name = "Mustafa";
        int age = 38;
        String citizen = "USA";
        boolean isEligible = age>21 && citizen == "USA";

        if(isEligible){
            System.out.println(name + " is eligible to vote in USA.");
        }
if(!isEligible){
    System.out.println(" not eligible");
}







    }
}
