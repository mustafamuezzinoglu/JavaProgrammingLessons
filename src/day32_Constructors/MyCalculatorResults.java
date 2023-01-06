package day32_Constructors;

public class MyCalculatorResults {
    public static void main(String[] args) {
        MyCalculatorV1 myCal = new MyCalculatorV1();
        System.out.println("returns:" + myCal.plus(5,4)  );
        System.out.println("returns:" + myCal.minus(5,4)  );
        System.out.println("returns:" + myCal.multiply(5,4)  );
        System.out.println("returns:" + myCal.divide(5,4)  );

    }
}
