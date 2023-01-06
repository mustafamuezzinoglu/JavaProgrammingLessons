package day11_SwitchScanner;

public class DaysInWeek {
    public static void main(String[] args) {

       /* int n = 5; //1 ~ 7

        if(n == 1){
            System.out.println("Monday");
        }else if(n == 2){
            System.out.println("Tuesday");
        }else if(n == 3){
            System.out.println("Wednesday");
        }else if( n == 4){
            System.out.println("Thursday");
        }else if(n == 5){
            System.out.println("Friday");
        }else if(n==6){
            System.out.println("Saturday");
        } else{
            System.out.println("Sunday");
        }

        System.out.println("------------------------------------------------");

        String System.out.println( (n == 1) ? "Monday" :(n == 2)? "Tuesday" :(n == 3)? "Wednesday" :( n == 4)? "Thursday"
                :(n == 5)? "Friday" :(n==6)? "Saturday" : "Sunday";

        System.out.println(result);


    }

}   */
        int number = 10;

        switch (number) {   //1,2,3,4,5,6,7.
            case 1:
                System.out.println( "Monday");
                break;// exits the switch after executing the case block

            case 2:
                System.out.println( "Tuesday");
                break; // exits the switch after executing the case block

            case 3:
                System.out.println( "Wednesday0");
                break;// exits the switch after executing the case block

            case 4:
                System.out.println( "Thursday");
                break;// exits the switch after executing the case block

            case 5:
                System.out.println( "Friday");
                break;// exits the switch after executing the case block

            case 6:
                System.out.println( "Saturday");
                break;// exits the switch after executing the case block

            case 7:
                System.out.println( "Sunday");
                break;

            default: //only gets executed if none of the case blocks are matching
                System.out.println( "Invalid");
                //we don't need to give break statement for the last block of the switch statement in order to exit switch
        }
    }
}
