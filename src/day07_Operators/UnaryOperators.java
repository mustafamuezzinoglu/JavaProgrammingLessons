package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int b = 100;
        System.out.println(++b); // pre icrement: increases the value by 1 right away
        System.out.println("----------------");

        int c = 100;
        System.out.println(c++); // post increment: first passes the current value than increases the value by 1
        System.out.println(c); //101
        System.out.println(c++);
        System.out.println(c);
        System.out.println(++c);
        System.out.println("----------------");
        int x = 200;
        System.out.println(--x); //pre decrement: decreases the value by 1 right away
        System.out.println(x--);
        System.out.println(x);
        System.out.println(--x);
        System.out.println(x--);
        System.out.println(x--);
        System.out.println(x);
        System.out.println("----------------");


        int y = 200;
        System.out.println(y--); // post decrement : first passes the current value than decreases the value by 1
        System.out.println(y);




    }





}
