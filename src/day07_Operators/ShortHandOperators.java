package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {

        //assignment:
        int number = 100;
        System.out.println("number = " + number); // 100

        number = 200;
        System.out.println("number = " + number); // 200

        String word = "Java Programming";
        System.out.println("word = " + word); // "Java programming"
        word = "Wooden Spoon";
        System.out.println("word = " + word); // "Wooden Spoon"
        word = "Cydeo"; // "Cydeo"

        System.out.println("--------------------------------");
        //addition assignment
        int x = 100;
        System.out.println("x = " + x);
        System.out.println(x + 200); //300
        x += 200;
        System.out.println("x" + x);
        String str = "Wooden";
        str += " Spoon";
        System.out.println("str = " + str);
        double number1 = 2.5;
        System.out.println("number1 = " + number1); //2.5
        number1 += 5.5;
        System.out.println("number1 = " + number1); //8.0
        double availableBalance= 1000.5;
        //deposite 300$
        availableBalance += 300;
        System.out.println("availableBalance = " + availableBalance); //1300.5$
        System.out.println("-----------------------");


        // withdroving 500$
        availableBalance -=500; //800.5
        System.out.println("availableBalance = " + availableBalance);
        //withdrowing 500$, then depositing 400$
        availableBalance -=200; // 600.5
        availableBalance +=400; // 1000.5
        System.out.println("availableBalance = " + availableBalance);
        System.out.println("-------------------");
        double salary = 50000.5;
        System.out.println("salary = " + salary);
        salary *=2;
        System.out.println("salary = " + salary);
        double doge=0.00000001;
        doge *=1000000;
        System.out.println("doge = " + doge);
        System.out.println("----------------------");
        double number2=25000;
        number2 /=2;
        System.out.println("number2 = " + number2);
        System.out.println("---------------------------");
        double number3=10;
        number3%=3;
        System.out.println("number3 = " + number3);
        System.out.println("--------------------------");
        int amount=127;
        int quarters =amount/25;
        int cents =amount%25;
        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);
        System.out.println("--------------------------");
        int y =300;
        y%=16;
        System.out.println("y = " + y);
        System.out.println("--------------------------");
        int balance = 3500;
        //insurance fee : 153
        int monthly =balance/153;
        int lastMonth =balance%153;
        System.out.println("monthly = " + monthly);
        System.out.println("lastMonth = " + lastMonth);
    }


}
