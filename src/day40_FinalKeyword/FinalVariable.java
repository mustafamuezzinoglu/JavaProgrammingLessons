package day40_FinalKeyword;

public class FinalVariable {

    final String birthDay;
    final static String name;

    static {
        name = "EU10";
    }

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }

    public static void main(String[] args) {

      final  double pi = 3.14;

        // pi= 4.14; if variable is final it can not be reassigned because final makes it unchangeable

        final String name;

        name = "Java";
//        name = "Wooden Spoon"; final variables only one time declared after that isnt reassigned
        System.out.println(name);
        System.out.println("--------------------------");

        FinalVariable obj = new FinalVariable("May/01");

//        obj.birthDay = "June/01";  final variables can not reassigned

        System.out.println(obj.birthDay);
        System.out.println("--------------------------");

        System.out.println(FinalVariable.name);



    }


}
