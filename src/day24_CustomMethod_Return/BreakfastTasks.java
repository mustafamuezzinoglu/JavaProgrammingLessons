package day24_CustomMethod_Return;

import jdk.swing.interop.SwingInterOpUtils;

public class BreakfastTasks {
    public static void main(String[] args) {

        initials("wWooden","sSpoon");  // W.S
        System.out.println("---------------------+-");
        domain("cydeo.school@gmail.com");
        System.out.println("-----------------------");
        String [] emails= { "josh@gmail.com", "jim@yahoo.com", "elminur@cydeo.com", "gulsen@gmail.com"};
        for (String email : emails) {
            domain(email);
        }
        nameOfMonth(11);
        nameOfDay(5);

    }
// 	1. Create a method that can display the initials of the person.  initials(String firstName, String lastName)
    public static void initials(String firstName, String lastName){
        String intials = firstName.charAt(0)+"."+lastName.charAt(0);
        intials = intials.toUpperCase();
        System.out.println("initials= "+ intials);
    }
//	2. Create a method that can display the domain of the email
    public static void domain(String email){ //Cydeo.school@gmail.com
       String domain=email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
    System.out.println("domain is: "+domain);
    }
//3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number){ //main method içinde verilen numaranın hangi aya ait olduğunu  buluyoruz öncelikle çıkacak sonuç için String isim tanımlıyoruz ve if else ile tamamlayıp print ediyoruz
String name = "";
if(number>=1 && number <=12){
    name = number==1 ? "Jan":number==2 ? "Feb" :number==3 ? "Mar" :number==4 ? "Apr": number==5 ? "May":number==6 ? "Jun" :number==6 ? "Jul" :number==8 ? "Aug":number==9 ? "Sep": number==10 ? "Oct":number==11 ? "Nov" :" Dec";
}else{
    name ="Invalid";
}
        System.out.println("Month name is = " + name);
}
// 4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay( int number){
        String name="";
        if(number>=1&&number<=7){
            name = number==1 ? "Mon" : number==2 ? "Tue" : number==3 ? "Wed" : number==4 ? "Thu" : number==5 ? "Fri" : number==6 ? "Sat" :"Sun";
        }else{
            name ="Invalid";
        }
        System.out.println("Day name is = " +name);
    }
    
//5. Create a method that can print how many days a month has


/* 6. ageGroups are:
                        infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
                        Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)
 */
}
