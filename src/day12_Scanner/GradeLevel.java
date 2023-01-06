package day12_Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        byte level = 19;
        String result ="";

        //if (level >=1 && level<=18){ //1 ~18
           switch (level){
               case 1 : case 2 : case 3: case 4: case 5 :
                   result ="Elementary School";
                   break;
               case 6 : case 7 : case 8:
                   result ="Middle School";
                   break;
               case 9 : case 10 : case 11: case 12:
                   result ="High School";
                   break;
               case 13 : case 14 : case 15: case 16:
                   result ="College";
                   break;
               case 17: case 18:
                   result = "Grad School";
               default:
                   result = "Invalid Grade ";
           }




        //}else{
          //  result= "Invalid Grade ";

        System.out.println(result);




    }
}
