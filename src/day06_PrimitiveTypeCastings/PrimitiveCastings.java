package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {
    public static void main(String[] args) {

        //IMPLICIT CASTING
        byte a = 100;
        short b = a;//implicit casting /java automaticly implicit byte to short
        //short b = (short) a;
        //       (short)a
        int c = b;//implicit casting /java automaticly implicit short to int
        // int c = (Short) b
        long d = c; //implicit casting / java automaticly implicit int to long
        float e = d;//implicit casting /java automaticly implicit long to float
        double f = e;//implicit casting /java automaticly implicit float to double
        System.out.println("------------------------------------");
        //EXPLICIT CASTING
        int x =55;
        short y = (short) x; //explicit casting /need to be casted manualy
        System.out.println(x + " : " + y);
        long j = 1000000;
        short k = (short)j; //explicit casting /need to be casted manualy
        System.out.println(j+" : "+k);
        double l = 2.5;
        float m = (float) l;//explicit casting /need to be casted manualy
        System.out.println(l+ " : " +m);
        double n = 10.8;
        int s = (int) n;//explicit casting /need to be casted manualy
        System.out.println(n+" : "+ s);
        System.out.println("--------------------------");
        double d1 = 20.5;
        short s1 = (short) d1;
        System.out.println(d1+" : "+s1);
        float f1 =30.5F;
        long l1 = (long) f1;
        System.out.println(l1+":"+f1);




    }
}
